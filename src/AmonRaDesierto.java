public class AmonRaDesierto extends AmonRa
{
	public AmonRaDesierto(double difficulty)
	{
		super();
		this.action = new EnemyAction();
		this.agility *= difficulty;
		this.defense *= difficulty;
		this.strength *= difficulty;
	}
}