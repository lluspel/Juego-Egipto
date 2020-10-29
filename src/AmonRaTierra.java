public class AmonRaTierra extends AmonRa
{
	public AmonRaTierra(double difficulty)
	{
		super();
		this.action = new EnemyAction();
		this.agility *= difficulty;
		this.defense *= difficulty;
		this.strength *= difficulty;
	}
}
