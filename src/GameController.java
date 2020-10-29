
import java.util.ArrayList;
import java.util.Scanner;

public class GameController {
    protected Worlds world;
    protected int victories;
    protected Character ally;
    protected ArrayList<Character> enemies;


    public GameController()
    {
        this.world = new Tierra();
        this.victories = 0;
        this.ally = null;
        this.selectAlly();
        this.enemies = this.world.createEnemies(this.ally);
    }
    

    public void selectAlly()
    {
        Scanner allyCharacter = new Scanner(System.in);
        int godNumber = 0;
        int weaponNumber = 0;
        Weapons weaponSelected = null;
        

        System.out.println("-------------------------------------------PERSONAJES--------------------------------------------");
        System.out.println("1----AmonRa    (Ataque especial = incrementa 30 fuerza)");
        System.out.println("2----Horus     (Ataque especial = incrementa 30 defensa)");
        System.out.println("3----Anubis    (Ataque especial = incrementa 30 agilidad)");
        System.out.println("4----Isis      (Ataque especial = incrementa 30 salud)");
        System.out.println("5----Seth      (Ataque especial = incrementa 10 fuerza, agilidad y defensa)");
        System.out.println("Por favor, seleccione uno: ");

        while (godNumber != 1 && godNumber != 2 && godNumber != 3 && godNumber!=4 && godNumber!=5)
        {
            godNumber = allyCharacter.nextInt();

            if (godNumber != 1 && godNumber != 2 && godNumber != 3 && godNumber!=4 && godNumber!=5)
            {
                System.out.println("--------Seleccione entre 1, 2, 3, 4 o 5--------");
            }
        }

        System.out.println();


        System.out.println("---------------------ARMAS---------------------");
        System.out.println("1----ArrowBow  (danio = 08 | precision = 1.00 )");
        System.out.println("2----Khopesh   (danio = 15 | precision = 0.50 )");
        System.out.println("3----Spear     (danio = 12 | precision = 0.80 )");
        System.out.println("4----Mace      (danio = 17 | precision = 0.32 )");
        System.out.println("Por favor, seleccione una: ");
        
        while (weaponNumber != 1 && weaponNumber != 2 && weaponNumber != 3 && weaponNumber!=4)
        {
            weaponNumber = allyCharacter.nextInt();

            if (weaponNumber != 1 && weaponNumber != 2 && weaponNumber != 3 && weaponNumber!=4)
            {
                System.out.println("--------Seleccione entre 1, 2, 3, 4 o 5--------");
            }
        }

        System.out.println();

        switch (godNumber)
        {
            case 1:
                this.ally = new AmonRa();
                break;

            case 2:
                this.ally = new Horus();
                break;
            
            case 3:
                this.ally = new Anubis();
                break;
            
            case 4:
                this.ally = new Isis();
                break;

            default:
                this.ally = new Seth();
                break;
        }

        switch (weaponNumber)
        {
            case 1:
                weaponSelected = new ArrowBow();
                break;

            case 2:
                weaponSelected = new Khopesh();
                break;
            
            case 3:
                weaponSelected = new Spear();
                break;
        
            default:
                weaponSelected = new Mace();
                break;
        }
        
        this.ally.setWeapon(weaponSelected);
        this.ally.setAction(new AllyAction());
    }


    public void fight()
    {
        System.out.println();
        System.out.println("Oh vaya parece que estamos en " + world.getName() + ", es ese el alcalde?");
        System.out.println("ALCALDE: " + world.getDescription());
        System.out.println("Como? No vais a pasar de fase? Eso no podemos permitirlo.\n");
        choseDecorator();

        ally.setHealth(ally.getMaxHealth());  //al entrar a un mundo nuevo dejamos la salud de nuestro jugador al maximo
        
        Battle currentBattle = null;
        
        for (int i = 1 ; i < 5; i++)
        {
            System.out.println();
        	System.out.println("PELEA " + i);
            currentBattle = new Battle(this.ally,this.enemies.remove(0));
            
            if(currentBattle.getGameResult() == false)
            {
                System.out.println("\nIntentalo otra vez para que " + world.getName() + " pase de fase.");
                break;
            }

            else
            {
            	this.victories += 1;
            	int quarterOfMaximumLife = this.ally.getMaxHealth()/4;
            	this.ally.recoverHealth(quarterOfMaximumLife);
            }
        }

        if (this.getVictories() == 4)
        {
            System.out.println(world.getName() + " pasa de FASE.\n");
            this.nextWorld();
        }

        if (this.ally.getAction().getIsSpecialPowerUsed())
        {
        	this.ally.getAction().setIsSpecialPowerUsed(false);
        }
    }


    public int getVictories()
    {
    	return this.victories;
    }


    public void nextWorld ()
    {
    	this.victories = 0;
    	
        if (this.world.getName().equals("Tierra"))
        {
            this.world = new Desierto();
            this.enemies = this.world.createEnemies(this.ally);
        }

        else if (this.world.getName().equals("Desierto"))
        {
            this.world = new Nun();
            this.enemies = this.world.createEnemies(this.ally);
        }

        else if (this.world.getName().equals("Nun"))
        {
            this.world = new Duat();
            this.enemies = this.world.createEnemies(this.ally);
        }

        else if (this.world.getName().equals("Duat"))
        { 
            System.out.println("         _____________                                                         _____________");
            System.out.println("       /_\\#|__|#|__|#/_\\       #                                     #       /_\\#|__|#|__|#/_\\");
            System.out.println("      |###/ __   __ \\###|      #                                     #      |###/ __   __ \\###|");
            System.out.println("      |___|  @\\ /@  |___|      #######################################      |___|  @\\ /@  |___|");
            System.out.println("      |###|    ¿    |###|      #                                     #      |###|    ¿    |###|");
            System.out.println("      |___| \\  -  / |___|      #          FELICIDADES CRACK          #      |___| \\  -  / |___|");
            System.out.println("      |###|\\__   __/|###|      #                                     #      |###|\\__   __/|###|");
            System.out.println("       |__|   ! !   |__|       #       Claudia Aragones-Chaves       #       |__|   ! !   |__|");
            System.out.println("      / \\#|    V    |#/ \\      #            y Luis Crespo            #      / \\#|    V    |#/ \\");
            System.out.println("     /                   \\     #                                     #     /                   \\");
            System.out.println("    |     |    _    |     |    #######################################    |     |    _    |     |");
            System.out.println("   _|___ |    | |    | ___|_   #                                     #   _|___ |    | |    | ___|_");
            System.out.println("  |_|_|_|-----+ +-----|_|_|_|  #                                     #  |_|_|_|-----+ +-----|_|_|_|");
        }
    }
    protected void choseDecorator ()
    {
        Scanner scanner = new Scanner(System.in);
        this.ally.resetWeapon();
        Weapons allyWeapon = this.ally.getWeapon();

        System.out.println("Seleccione el decorator:");
        System.out.println("1----Fuego");
        System.out.println("2----Plaga");
        System.out.println("3----Veneno");

        int answer = scanner.nextInt();
        if(answer == 1)
        {
            System.out.println("El decorator fuego ha sido seleccionado.");
            allyWeapon = new FireDecorator(allyWeapon); //setDecorator fire
            ally.setWeapon(allyWeapon);
        }

        else if(answer == 2)
        {
            System.out.println("El decorator plaga ha sido seleccionado.");
            allyWeapon = new PlagueDecorator(allyWeapon); //setDecorator Plague
            ally.setWeapon(allyWeapon);//setDecorator Plague
        }

        else if (answer == 3)
        {
            System.out.println("El decorator veneno ha sido seleccionado.");
            allyWeapon = new PoisonDecorator(allyWeapon);
            ally.setWeapon(allyWeapon);//setDecorator Poison
        }

        else
        {
            System.out.println("Ningun decorator ha sido seleccionado.");
            ally.setWeapon(allyWeapon);//Sin decorador
        }
    }
}