public class Horus extends Character
{
	public Horus()
	{
		this.name = "Horus";
		this.maxHealth = 100;
		this.health = maxHealth;
		this.agility = 10;
		this.defense = 15;
		this.strength = 15;
		this.stateMachine = new StateMachine();
		this.weapon = this.randomWeapon();
		this.description = this.getName() + "->"+ "Fuerza = " + this.getStrength() + " | Defensa = " + this.getDefense() +
							" | Agilidad = "+ this.getAgility() + "\nAtaque especial = incrementa 30 defensa";
	}

	protected void specialAttack()
	{
		int increaseDefense = 30;
		this.defense += increaseDefense;
	}
}