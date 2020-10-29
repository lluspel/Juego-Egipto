import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class AllyAction extends Action 
{
	public AllyAction()
	{
		super();
		this.specialAttackSelected =  false;
	}

	protected boolean getSpecialPower() 
	{
        return this.getSpecialAttackSelected();
    }
}
