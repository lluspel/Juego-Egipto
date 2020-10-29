import java.util.ArrayList;

public class Tierra extends Worlds 
{
	public Tierra() 
	{
        this.dificulty = 0.8;
        this.name = "Tierra";
        this.description = "Bienvenido a 'La Tierra' es el lugar donde mas discotecas encontraras"
        		+ " pero para poder perrear tenemos que pasar de fase.";
    }
	
	
    public ArrayList<Character> createEnemies(Character ourCharacter)
    {
    	ArrayList<Character> mapEnemiesList = new ArrayList<Character>();
    	mapEnemiesList.add(new AmonRaTierra(this.getDificulty()));
    	mapEnemiesList.add(new HorusTierra(this.getDificulty()));
    	mapEnemiesList.add(new SethTierra(this.getDificulty()));
    	mapEnemiesList.add(new IsisTierra(this.getDificulty()));
    	mapEnemiesList.add(new AnubisTierra(this.getDificulty()));
    	
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
    	for (int i = 0; i < 4; i++)
    	{
    		randomNumber = (int) (Math.random() * (mapEnemiesList.size()));
    		enemiesList.add(mapEnemiesList.remove(randomNumber));
    	}

    	return enemiesList;
    }
}