public class StateMachine 
{
	State strong;
	State weak;
	State wounded;
	State actualState;
	
	public StateMachine()
	{
		this.strong = new Strong(this);
		this.weak = new Weak(this);
		this.wounded = new Wounded(this);
		this.actualState = this.strong;
		
	}

	public void lookHealth(int health, int maxHealth)
	{
		this.actualState.lookHealth(health, maxHealth);
	}

	public void setState(State state)
	{
		this.actualState = state;
	}


	public void lookStrategyDescription()
	{
		this.actualState.strategy.description();
	}


	public State getState()
	{
		return this.actualState;
	}


	public void setAllyState (int numberAttack)
	{
		if (numberAttack == 1)
		{
			this.actualState = this.strong;
		}
		else if(numberAttack == 2)
		{
			this.actualState = this.weak;
		}
		else
		{
			this.actualState = this.wounded;
		}
	}
}