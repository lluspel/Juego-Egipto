public class HorusDesierto extends Horus
{
	public HorusDesierto(double difficulty)
	{
		super();
		this.action = new EnemyAction();
		this.agility *= difficulty;
		this.defense *= difficulty;
		this.strength *= difficulty;
	}
}