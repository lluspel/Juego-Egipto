public class IsisNun extends Isis
{
	public IsisNun(double difficulty)
	{
		super();
		this.action = new EnemyAction();
		this.agility *= difficulty;
		this.defense *= difficulty;
		this.strength *= difficulty;
	}
}