import java.util.ArrayList;

public abstract class Weapons 
{
	protected String name;
	protected int damage;
	protected double precision;
	protected String description;
	
	public Weapons()
	{
		this.damage = 0;
	}

	public Weapons reset()
	{
		return this;
	}

	public String getName()
	{
		return this.name;
	}

	public int getDamage()
	{
		return this.damage;
	}

	public double getPrecision()
	{
		return this.precision;
	}

	public String getDescription() 
	{
		return this.description;
	}

	protected Weapons getRandomWeapon()
	{
		ArrayList<Weapons> weaponsList = new ArrayList<Weapons>();
		weaponsList.add(new Khopesh());
		weaponsList.add(new Spear());
		weaponsList.add(new Mace());
		weaponsList.add(new ArrowBow());
		
		int randomNumber;
		
		randomNumber = (int) (Math.random() * (weaponsList.size()));
		
		return weaponsList.get(randomNumber);
	}
}