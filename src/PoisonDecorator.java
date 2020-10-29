public class PoisonDecorator extends WeaponDecorator
{
	public PoisonDecorator(Weapons n) 
	{
		super(n);
        this.description = "+0.6 precision | +3 danio ";
    }

    public int getDamage()
    {
        damage = 3;
        return (this.weapon.getDamage() + damage);
    }

    public double getPrecision()
    {
        precision = 0.60;
        return (this.weapon.getPrecision() + precision);
    }

    public String getName()
    {
        name = " Poison";
        return (this.weapon.getName() + name);
    }
}