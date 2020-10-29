public class Isis extends Character
{
	public Isis()
	{
		this.name = "Isis";
		this.maxHealth = 100;
		this.health = maxHealth;
		this.agility = 20;
		this.defense = 10;
		this.strength = 10;
		this.stateMachine = new StateMachine();
		this.weapon = this.randomWeapon();
		this.description = this.getName() + "->"+ "Fuerza = " + this.getStrength() + " | Defensa = " + this.getDefense() +
							" | Agilidad = "+ this.getAgility() + "\nAtaque especial = incrementa 30 salud";
	}

	protected void specialAttack()
	{
		int increaseHealth = 30;
		this.recoverHealth(increaseHealth);
	}
}