public class AnubisTierra extends Anubis
{
	public AnubisTierra(double difficulty)
	{
		super();
		this.action = new EnemyAction();
		this.agility *= difficulty;
		this.defense *= difficulty;
		this.strength *= difficulty;
	}
}