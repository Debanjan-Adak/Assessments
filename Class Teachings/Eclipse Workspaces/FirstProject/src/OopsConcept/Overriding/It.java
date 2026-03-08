package OopsConcept.Overriding;

public class It extends Employee{

	double varPay=200000;
	@Override
	public It SalCal() {
		return this;
	}
	public String SalCal(byte duration)
	{
		return "hello" ;
	}
	public double SalCal(double bonus) {
		return (basePay+varPay+bonus);
	}
}
