public abstract class WeaponDecorator extends Weapons
{
	protected Weapons weapon;
	protected int damage;
	protected String description;
	protected String name;
	protected double precision;
	
	public WeaponDecorator(Weapons n)
	{
		super();
		this.weapon = n;
	}
	
	public Weapons reset()
	{
		return this.weapon.reset();
	}
	
	public  String getName()
    {
        return this.name;
    }

	public  int getDamage()
    {
        return this.damage;
	}
	
	public  double getPrecision()
    {        
		return this.precision;
	}
	
	public  String getDescription()
    {
        return this.description;
	}
}