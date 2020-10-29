public class PlagueDecorator extends WeaponDecorator
{
	public PlagueDecorator(Weapons n) 
	{
		super(n);
		this.description = "+0.2 precision | +8 danio ";
	}

	public int getDamage()
	{
		damage = 8;
		return (this.weapon.getDamage() + damage);
	}

	public double getPrecision()
	{
		precision = 0.2;
		return (this.weapon.getPrecision() + precision);
	}

	public String getName()
	{
		name = " Plague";
		return (this.weapon.getName() + name);
	}
}