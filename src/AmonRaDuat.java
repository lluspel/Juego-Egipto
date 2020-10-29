public class AmonRaDuat extends AmonRa
{
	public AmonRaDuat(double difficulty)
	{
		super();
		this.action = new EnemyAction();
		this.agility *= difficulty;
		this.defense *= difficulty;
		this.strength *= difficulty;
	}
}