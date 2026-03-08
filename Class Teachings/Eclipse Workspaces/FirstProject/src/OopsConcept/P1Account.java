package OopsConcept;

public class P1Account {
	private double bal=6000.0;
	private short pin = 6598;
	
	public double getBal(short pin)
	{
		if(this.pin==pin)
		return bal;
		else
			return -111111.0;
	}
	public void setBalCredir(double amt)
	{
		this.bal+=amt;
	}
	public void setBalDebit(double amt)
	{
		this.bal-=amt;
	}
	
}
