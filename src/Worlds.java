import java.util.ArrayList;

public abstract class Worlds 
{
    protected double dificulty;
    protected String name;
    protected String description;
    protected abstract ArrayList<Character> createEnemies(Character ourCharacter);

    protected double getDificulty()
    {
    	return this.dificulty;
    }

    protected String getName() { return name;}
    protected String getDescription(){ return description;}
}