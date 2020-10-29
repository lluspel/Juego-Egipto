public abstract class Action
{
    protected boolean isSpecialPowerUsed;
    protected boolean specialAttackSelected;
    
    protected Action()
    {
    	this.isSpecialPowerUsed = false;
    	this.specialAttackSelected = false;
    }
    

    public boolean selectSpecialAttack(){
        //Show stats
        if(!this.getIsSpecialPowerUsed())  // Si aun no hemos usado el poder especial
        {
        	if(getSpecialPower())
            {
        		this.isSpecialPowerUsed = true;
                return true;
            }
        }
        return false;
    }

    protected abstract boolean getSpecialPower();

    public void setIsSpecialPowerUsed(boolean selected)
    {
    	this.isSpecialPowerUsed = selected;
    }


    protected boolean getIsSpecialPowerUsed()
    {
    	return this.isSpecialPowerUsed;
    }


    public void setSpecialAttackSelected(boolean selected)
    {
    	this.specialAttackSelected = selected;
    }


    public boolean getSpecialAttackSelected()
    {
    	return this.specialAttackSelected;
    }
}