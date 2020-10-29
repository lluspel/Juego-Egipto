public class AnubisDesierto extends Anubis
{
	public AnubisDesierto(double difficulty)
	{
		super();
		this.action = new EnemyAction();
		this.agility *= difficulty;
		this.defense *= difficulty;
		this.strength *= difficulty;
	}
}