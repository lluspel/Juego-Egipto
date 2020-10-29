public class SethDuat extends Seth
{
	public SethDuat(double difficulty)
	{
		super();
		this.action = new EnemyAction();
		this.agility *= difficulty;
		this.defense *= difficulty;
		this.strength *= difficulty;
	}
}