package OopsConcept.Overriding;

public class Employee {
	double basePay=300000;
	 protected Employee SalCal() {
		return this;
	}
	public Object SalCal(byte duration)
	{
		return basePay/12*duration;
	}
}
