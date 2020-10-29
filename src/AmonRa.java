public class AmonRa extends Character
{
	public AmonRa()
	{
		this.name = "AmonRa";
		this.maxHealth = 100;
		this.health = maxHealth;
		this.agility = 5;
		this.defense = 10;
		this.strength = 25;
		this.stateMachine = new StateMachine();
		this.weapon = this.randomWeapon();
		this.description = this.getName() + "->"+ "Fuerza = " + this.getStrength() + " | Defensa = " + this.getDefense() +
							" | Agilidad = "+ this.getAgility() + "\nAtaque especial = incrementa 30 fuerza";
	}

	protected void specialAttack()
	{
		int increaseStrength = 30;
		this.strength += increaseStrength;
	}
}