import java.util.ArrayList;

public class Duat extends Worlds
{
	public Duat() 
	{
        this.dificulty = 1.1;
        this.name = "Duat";
        this.description = "Bienvenido a Duat, aqui aunque sea el inframundo nos salen unas bbq perfectas"
        		+ " asi que tenemos que pasar de fase para poder celebrarlas con mas gente.";
	}
	
	
    public ArrayList<Character> createEnemies(Character ourCharacter)
    {
    	ArrayList<Character> mapEnemiesList = new ArrayList<Character>();
    	mapEnemiesList.add(new AmonRaDuat(this.getDificulty()));
    	mapEnemiesList.add(new HorusDuat(this.getDificulty()));
    	mapEnemiesList.add(new SethDuat(this.getDificulty()));
    	mapEnemiesList.add(new IsisDuat(this.getDificulty()));
    	mapEnemiesList.add(new AnubisDuat(this.getDificulty()));
    	
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
    	
    	int randomNumber;
    	for(int i=0; i<4;i++)
    	{
    		randomNumber = (int) (Math.random() * (mapEnemiesList.size()));
    		enemiesList.add(mapEnemiesList.remove(randomNumber));
    	}

    	return enemiesList;
    }
}
