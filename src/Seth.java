public class Seth extends Character
{
	public Seth()
	{
		this.name = "Seth";
		this.maxHealth = 100;
		this.health = maxHealth;
		this.agility = 5;
		this.defense = 15;
		this.strength = 20;
		this.stateMachine = new StateMachine();
		this.weapon = this.randomWeapon();
		this.description = this.getName() + "->"+ "Fuerza = " + this.getStrength() + " | Defensa = " + this.getDefense() +
							" | Agilidad = "+ this.getAgility() + "\nAtaque especial = incrementa 10 fuerza, agilidad y defensa";
	}

	protected void specialAttack()
	{
		int increaseAll = 10;
		this.strength += increaseAll;
		this.agility +=increaseAll;
		this.defense +=increaseAll;
	}
}