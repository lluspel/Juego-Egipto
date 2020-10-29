public class FireDecorator extends WeaponDecorator
{
	public FireDecorator(Weapons n) 
	{
		super(n);
        this.description = "+0.0 precision | +15 danio ";	
	}

	public int getDamage()
	{
		damage = 15;
		return (this.weapon.getDamage() + damage);
	}

	public double getPrecision()
	{
		precision = 0.0;
		return (this.weapon.getPrecision() + precision);
	}
	
	public String getName()
	{
		name = " Fire";
		return (this.weapon.getName() + name);
	}
}