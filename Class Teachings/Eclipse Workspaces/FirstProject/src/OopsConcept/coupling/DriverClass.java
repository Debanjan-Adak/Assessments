package OopsConcept.coupling;

import java.util.Scanner;

public class DriverClass {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter 1 for Petrol Engine\nEnter 2 for Diesel Engine ");
		byte choice = sc.nextByte();
		Car car = new Car();
		Engine engine;
		switch(choice)
		{
		case 1:
			engine= new PetrolEngine();
			break;
		case 2:
			engine= new DieselEngine();
			break;
		default:
			engine=new PetrolEngine();
			break;
		}
		car.engine=engine;
		System.out.println(car.engine.getClass());
		
	}

}
