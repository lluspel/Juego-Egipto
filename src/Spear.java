public class Spear extends Weapons
{
	public Spear()
	{
		this.name = "Spear";
		this.damage = 12;
		this.precision = 0.80;
		this.description = "Danio = " + getDamage() + "| Precision = "+ getPrecision();
	}
}