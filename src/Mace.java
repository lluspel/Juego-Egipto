public class Mace extends Weapons
{
	public Mace()
	{
		this.name = "Mace";
		this.damage = 17;
		this.precision = 0.32;
		this.description = "Danio = " + getDamage() + "| Precision = "+ getPrecision();
	}
}