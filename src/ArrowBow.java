public class ArrowBow extends Weapons
{
	public ArrowBow()
	{
		this.name = "ArrowBow";
		this.damage = 8;
		this.precision = 1.00;
		this.description = "Danio = " + getDamage() + "| Precision = "+ getPrecision();
	}
}