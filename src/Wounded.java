public class Wounded extends State
{
	StateMachine machine;

	public Wounded (StateMachine machine)
	{
		this.machine = machine;
		this.name = "Wounded";
		this.strategy = new Evasive();
	}

	public void lookHealth (int health, int maxHealth)
	{
		int halfHealth = maxHealth/2;
		
		if (health > 10 && health < halfHealth)
		{
			this.machine.setState(machine.weak);
		}

		else if(health <= 10)
		{
			this.machine.setState(machine.wounded);
		}

		else
		{
			this.machine.setState(machine.strong);
		}
	}
}