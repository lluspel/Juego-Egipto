public class AttackCalculator
{
	private static AttackCalculator attackCalculator;
	
	private AttackCalculator() 
	{ 
		//vacio
	}
	

	public static AttackCalculator getAttackCalculator()
	{
		if(attackCalculator == null)
		{
			attackCalculator = new AttackCalculator();
		}

		return attackCalculator;
	}


	public int calculateAttackDamage (int damage, int defense)
	{
		if (damage <= defense)
		{
			return 0;
		}
		
		return (damage-defense);
	}
}