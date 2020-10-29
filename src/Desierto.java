import java.util.ArrayList;

public class Desierto extends Worlds
{
	public  Desierto() 
	{
        this.dificulty = 0.9;
        this.name = "Desierto";
        this.description = "Bienvenido a 'El Desierto'. Somos una zona donde abunda el calor por ello debemos pasar de fase y así podremos ir de piwi.";
	}
	
	
    public ArrayList<Character> createEnemies(Character ourCharacter)
    {
    	ArrayList<Character> mapEnemiesList = new ArrayList<Character>();
    	mapEnemiesList.add(new AmonRaDesierto(this.getDificulty()));
    	mapEnemiesList.add(new HorusDesierto(this.getDificulty()));
    	mapEnemiesList.add(new SethDesierto(this.getDificulty()));
    	mapEnemiesList.add(new IsisDesierto(this.getDificulty()));
    	mapEnemiesList.add(new AnubisDesierto(this.getDificulty()));
    	
		if(ourCharacter.getName().equals("AmonRa"))
		{
    		mapEnemiesList.remove(0);
		}
		
		else if(ourCharacter.getName().equals("Horus"))
		{
			mapEnemiesList.remove(1);
		}

		else if(ourCharacter.getName().equals("Seth"))
		{
    		mapEnemiesList.remove(2);
		}
		
		else if(ourCharacter.getName().equals("Isis"))
		{
			mapEnemiesList.remove(3);
		}
		
		else if(ourCharacter.getName().equals("Anubis"))
		{
			mapEnemiesList.remove(4);
		}
		
		else
		{
			System.out.println("Uis se fue alv.");
			return null;
		}
	
    	ArrayList<Character> enemiesList = new ArrayList<Character>();
    	
    	int randomNum;
    	for (int i = 0; i < 4; i++)
    	{
    		randomNum = (int) (Math.random() * (mapEnemiesList.size()));
    		enemiesList.add(mapEnemiesList.remove(randomNum));
    	}

    	return enemiesList;
    }
}