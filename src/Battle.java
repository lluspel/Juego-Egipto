public class Battle
{
    protected boolean gameResult;

    public Battle(Character ally, Character enemy) 
    {
    	this.gameResult = false;
    	this.startBattle(ally, enemy);
    }


    public void startBattle(Character ally, Character enemy) 
    {
        System.out.println();
        System.out.println(enemy.getName() + " no quiere que pases de fase, hay que darle con la cacerola para que cambie de opinion.\n");
        AttackCalculator calculator = AttackCalculator.getAttackCalculator();
        
        int allyAgility = ally.getAgility();
        int enemyAgility = enemy.getAgility();
        int damageDone = 0;
        System.out.println("--------------------Tus estadisticas-------------------");
        ally.viewStatistics();
        System.out.println("----------------Estadisticas del enemigo---------------");
        enemy.viewStatistics();
        
        while (enemy.getHealth() > 0 && ally.getHealth() > 0) 
        {
            if (allyAgility >= enemyAgility)
            {
            	ally.selectAllyAttack();
            	damageDone = calculator.calculateAttackDamage(ally.attack(), enemy.getDefense());
            	enemy.loseHealth(damageDone);
            	System.out.println("+----------------------------------------------------------+");
            	System.out.println("    -" + enemy.getName());
            	System.out.println("    Le has quitado "+ damageDone + " de vida.");
            	System.out.println("    VIDA RESTANTE: " +enemy.getHealth());
            	System.out.println("+----------------------------------------------------------+");
            	
            	damageDone = calculator.calculateAttackDamage(enemy.attack(), ally.getDefense());
            	ally.loseHealth(damageDone);
            	System.out.println("+----------------------------------------------------------+");
            	System.out.println("    -" + ally.getName());
            	System.out.println("    Te han quitado "+ damageDone + " de vida.");
            	System.out.println("    VIDA RESTANTE: " +ally.getHealth());
            	System.out.println("+----------------------------------------------------------+");
            }

            else
            {
            	damageDone = calculator.calculateAttackDamage(enemy.attack(), ally.getDefense());
            	ally.loseHealth(damageDone);
            	System.out.println("+----------------------------------------------------------+");
            	System.out.println("    -" + ally.getName());
            	System.out.println("    Te han quitado "+ damageDone + " de vida.");
            	System.out.println("    VIDA RESTANTE: " +ally.getHealth());
            	System.out.println("+----------------------------------------------------------+");
                
            	ally.selectAllyAttack();
            	damageDone = calculator.calculateAttackDamage(ally.attack(), enemy.getDefense());
            	enemy.loseHealth(damageDone);
            	System.out.println("+----------------------------------------------------------+");
            	System.out.println("    -" + enemy.getName());
            	System.out.println("    Le has quitado "+ damageDone + " de vida.");
            	System.out.println("    VIDA RESTANTE: " +enemy.getHealth());
            	System.out.println("+----------------------------------------------------------+");
            }

            if (enemy.health <= 0) 
            {
            	System.out.println();
                System.out.println(enemy.getName()+ " ha sufrido la ira cayetana, felicidades!");
                this.setGameResult(true);

            } 

            else if (ally.health <= 0) 
            {
            	System.out.println();
                System.out.println("El comunismo de " + enemy.getName() + " te ha vencido, no pasas de fase");
                this.setGameResult(false);
            }
        }
    }


    protected void setGameResult(boolean result)
    {
        this.gameResult = result;
    }


    protected boolean getGameResult()
    {
        return this.gameResult;
    }
}