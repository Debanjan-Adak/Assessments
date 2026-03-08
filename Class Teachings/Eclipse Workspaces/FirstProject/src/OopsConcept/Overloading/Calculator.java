package OopsConcept.Overloading;

public class Calculator {
	public static void addition()
	{
		//base1
	}
	public Object addition(double op1)
	{
		//no of arg
		//base 2 compare with 1 
		return 5.5;
	}
	public static Double addition(double op1, double op2)
	{
		return 5.5;
	}
	public static void addition(float op1, double op2)
	{
		
	}
	public static void addition(double op1,float op2)
	{
		
	}
	public static void addition(double op1, char opr, double op2)
	{
		
	}
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.addition(10);
		addition(7.8,2.4);
		addition(4,'+',3);
	}
}
