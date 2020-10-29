import java.util.ArrayList;
import java.util.Scanner;

public abstract class Character 
{
	protected int strength;
	protected int defense;
	protected int agility;
	protected int maxHealth;
	protected int health;

	protected Action action;

	protected String name;
	protected String description;

	protected StateMachine stateMachine;

	protected Weapons weapon;

    protected abstract void specialAttack();
 
	public Character() 
	{
		this.strength = 0;
		this.defense = 0;
		this.agility = 0;
		this.maxHealth=100;
		this.health = maxHealth;

		this.action = null;

		this.name = null;
		this.description = "";

		this.stateMachine = new StateMachine();
		
		this.weapon = this.randomWeapon();
	}
	

	protected void loseHealth (int amount)
	{
		this.health -= amount;
		this.checkState();
	}


	protected void recoverHealth (int amount)
	{
		if (this.getHealth() <= (this.getMaxHealth() - amount))	
		{
			this.health += amount;
		}

		else
		{
			this.health = this.getMaxHealth();
		}
	
		this.checkState(); // comprobamos que no se haya muerto
	}

	protected void resetWeapon()
	{
		this.weapon = this.weapon.reset();
	}


	protected Weapons randomWeapon()
	{
		ArrayList<Weapons> weaponsArray = new ArrayList<Weapons>();
		weaponsArray.add(new Khopesh());
		weaponsArray.add(new Spear());
		weaponsArray.add(new Mace());
		weaponsArray.add(new ArrowBow());
		
		int randomNum;
		
		randomNum = (int) (Math.random() * (weaponsArray.size()));
		
		return weaponsArray.get(randomNum);
	}


	protected void viewStatistics()
	{  	
		System.out.println("Nombre: " + this.getName());
		System.out.println("Salud: " + this.getHealth());
		System.out.println("Fuerza: " + this.getStrength());
		System.out.println("Defensa: " + this.getDefense());
		System.out.println("Agilidad: " + this.getAgility());
		System.out.println("Arma: " + this.weapon.getName() + " ( Danio = " + this.weapon.getDamage() + " | Precision = " + this.weapon.getPrecision() + " )\n");
	}


	protected void selectAllyAttack()
	{
		Scanner allyAttack = new Scanner(System.in);
		int numberAttack = 0;
		System.out.println();
		System.out.println("Seleccione su ataque:");
		System.out.println("1----Ataque");
		System.out.println("2----Defensa");
		System.out.println("3----Evasion");
		
		if(!this.action.getIsSpecialPowerUsed())
		{
			System.out.println("4----Ataque especial");

			while(numberAttack != 1 && numberAttack != 2 && numberAttack != 3 && numberAttack != 4)
			{
				numberAttack = allyAttack.nextInt();

				if(numberAttack != 1 && numberAttack != 2 && numberAttack != 3 && numberAttack != 4)
				{
					System.out.println("-------Seleccione entre 1, 2, 3 o 4-------");
				}
			}

			if(numberAttack == 4)
			{
				this.getAction().setSpecialAttackSelected(true);
			}
		}

		else
		{
			while(numberAttack != 1 && numberAttack != 2 && numberAttack != 3)
			{
				numberAttack = allyAttack.nextInt();

				if(numberAttack != 1 && numberAttack != 2 && numberAttack != 3)
				{
					System.out.println("---------Seleccione entre 1, 2 o 3---------");
				}
			}

			this.stateMachine.setAllyState(numberAttack);
		}

		System.out.println();
	}


    public void checkState()
    {
        this.stateMachine.lookHealth(this.getHealth(), this.getMaxHealth());
    }


    public int attack()
    {
        if(this.action.selectSpecialAttack())
        {
			this.specialAttack();
			
            System.out.println("\n" + this.getName()  + " USA ATAQUE ESPECIAL!");
			System.out.println(this.getName() + " digievoluciona");
			
            this.viewStatistics();
			System.out.println("\n");
			
			this.getAction().setSpecialAttackSelected(false);
			
            return 0;
		}
		
		else 
		{
			if (this.stateMachine.getState().getName().equals("Strong"))
			{
				return (int) ((this.strength * this.weapon.getPrecision()) + this.weapon.getDamage());
			}
			
			else if (this.stateMachine.getState().getName().equals("Weak")) 
			{
                this.defense += 2;
                return (int) ((this.strength / 2 * this.weapon.getPrecision()) + this.weapon.getDamage());
			}

			else if (this.stateMachine.getState().getName().equals("Wounded")) 
			{
                this.defense += 5;
                return (int) ((this.strength / 3 * this.weapon.getPrecision()) + this.weapon.getDamage());
            }
		}
		
        return 0;
    }


	//---------------------SETS-----------------------
    protected void setHealth(int amount)
    {
        this.health = amount;
        this.checkState(); // comprobamos que no se haya muerto
	}
	
	protected void setAction(Action action)
	{
		this.action = action;
	}
	
	protected void setWeapon(Weapons newWeapon)
	{
		this.weapon = newWeapon;
	}
	
	//--------------RETURNS---------------------------
	protected int getStrength()
	{
		return this.strength;
	}
	
	protected int getDefense()
	{
		return this.defense;
	}
	
	protected int getAgility()
	{
		return this.agility;
	}
	
	protected Action getAction()
	{
		return this.action;
	}
	
	protected int getHealth()
	{
		return this.health;
	}
	
	protected String getDescription()
	{
		return this.description;
	}

	protected int getMaxHealth()
	{
		return this.maxHealth;
	}
	
	protected String getName()
	{
		return this.name;
	}

	protected Weapons getWeapon()
	{
		return this.weapon;
	}
}