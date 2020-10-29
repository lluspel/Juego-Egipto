import java.util.concurrent.ThreadLocalRandom;

public class EnemyAction extends Action
{
	public EnemyAction()
	{
		super();
	}
	
    protected boolean getSpecialPower() 
    {
        int randomNum = ThreadLocalRandom.current().nextInt(0, 4 + 1);
        if (randomNum == 1)
        {
        	this.setSpecialAttackSelected(true);
        }

        return this.getSpecialAttackSelected();
    }
}