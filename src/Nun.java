import java.util.ArrayList;

public class Nun extends Worlds
{
	public Nun() 
	{
        this.dificulty = 1;
        this.name = "Nun";
        this.description = "Bienvenido a Nun, el mejor sitio pa echarte un chapuzon "
        		+ "pero para ello antes tenemos que pasar de fase :( .";
	}
	
	
    public ArrayList<Character> createEnemies(Character ourCharacter)
    {
    	ArrayList<Character> mapEnemiesList = new ArrayList<Character>();
    	mapEnemiesList.add(new AmonRaNun(this.getDificulty()));
    	mapEnemiesList.add(new HorusNun(this.getDificulty()));
    	mapEnemiesList.add(new SethNun(this.getDificulty()));
    	mapEnemiesList.add(new IsisNun(this.getDificulty()));
    	mapEnemiesList.add(new AnubisNun(this.getDificulty()));
    	
		if (ourCharacter.getName().equals("AmonRa"))
		{
    		mapEnemiesList.remove(0);
		}
		
		else if (ourCharacter.getName().equals("Horus"))
		{
			mapEnemiesList.remove(1);
		}

		else if (ourCharacter.getName().equals("Seth"))
		{
    		mapEnemiesList.remove(2);
		}
		
		else if (ourCharacter.getName().equals("Isis"))
		{
			mapEnemiesList.remove(3);
		}
		
		else if (ourCharacter.getName().equals("Anubis"))
		{
			mapEnemiesList.remove(4);
		}
	
    	ArrayList<Character> enemiesList = new ArrayList<Character>();
    	
    	int randomNumber;
    	for(int i=0; i<4;i++)
    	{
    		randomNumber = (int) (Math.random() * (mapEnemiesList.size()));
    		enemiesList.add(mapEnemiesList.remove(randomNumber));
    	}

    	return enemiesList;
    }
}