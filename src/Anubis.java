public class Anubis extends Character
{
	public Anubis()
	{
		this.name = "Anubis";
		this.maxHealth = 100;
		this.health = maxHealth;
		this.agility = 14;
		this.defense = 13;
		this.strength = 13;
		this.stateMachine = new StateMachine();
		this.weapon = this.randomWeapon();
		this.description = this.getName() + "->"+ "Fuerza = " + this.getStrength() + " | Defensa = " + this.getDefense() +
							" | Agilidad = "+ this.getAgility() + "\nAtaque especial = incrementa 30 agilidad";
	}

	protected void specialAttack()
	{
		int increaseAgility = 30;
		this.agility += increaseAgility;
	}
}