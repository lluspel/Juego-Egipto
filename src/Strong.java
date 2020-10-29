public class Strong extends State
{
	StateMachine machine;
	public Strong(StateMachine machine)
	{
		this.machine = machine;
		this.name = "Strong";
		this.strategy = new Agressive();
	}

	public void lookHealth(int health, int maxHealth)
	{
		int halfHealth = maxHealth/2;
		
		if (health > 10 && health < halfHealth)
		{
			this.machine.setState(machine.weak);
		}

		else if (health <= 10)
		{
			this.machine.setState(machine.wounded);
		}

		else
		{
			this.machine.setState(machine.strong);
		}	
	}
}