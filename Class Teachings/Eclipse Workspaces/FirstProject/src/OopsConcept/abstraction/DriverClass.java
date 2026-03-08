package OopsConcept.abstraction;

import java.util.Scanner;

public class DriverClass {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Engine e = new PetrolEngine();
		e.startEngine();
		
	}

}
