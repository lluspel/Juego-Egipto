public abstract class State 
{
	String name;
	Strategy strategy;
	
	public abstract void lookHealth(int health, int maxHealth);
	
	public String getName()
	{
		return this.name;
	}
}