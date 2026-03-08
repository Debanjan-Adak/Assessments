import java.util.Scanner;

public class Calculator {
	
	private static void addition(double a,double b)
	{
		System.out.println("The addition of"+ a +" and "+b+" is " +(a+b));
	}
	private static void subtraction (double a,double b)
	{
		System.out.println("The subtraction of"+ a +" and "+b+" is " +(a-b));
	}
	private static void multiplication(double a,double b)
	{
		System.out.println("The multiplication of"+ a +" and "+b+" is " +(a*b));
	}
	private static void division(double a,double b)
	{
		if(b==0)
			{System.out.println("Error: Value divided by 0");
			return;}
		
		System.out.println("The division of"+ a +" and "+b+" is " +(a/b));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch;
		double a,b;
		do {
			System.out.println("Enter 1 for addition \nEnter 2 for subtraction \nEnter 3 for multiplication \nEnter 4 for division\nEnter 5 to exit");
			ch=sc.nextInt();
			sc.nextLine();
			switch(ch)
			{
			case 1:
				System.out.println("Enter first value");
				a=sc.nextDouble();
				sc.nextLine();
				System.out.println("Enter second value");
				b=sc.nextDouble();
				sc.nextLine();
				addition(a,b);
				break;
			case 2:
				System.out.println("Enter first value");
				a=sc.nextDouble();
				sc.nextLine();
				System.out.println("Enter second value");
				b=sc.nextDouble();
				sc.nextLine();
				subtraction(a,b);
				break;
			case 3:
				System.out.println("Enter first value");
				a=sc.nextDouble();
				sc.nextLine();
				System.out.println("Enter second value");
				b=sc.nextDouble();
				sc.nextLine();
				multiplication(a,b);
				break;
			case 4:
				System.out.println("Enter first value");
				a=sc.nextDouble();
				sc.nextLine();
				System.out.println("Enter second value");
				b=sc.nextDouble();
				sc.nextLine();
				division(a,b);
				break;
			case 5:
				//return;
				System.exit(0);
			default:
				System.out.println("Wrong choice try again");
			}
		}
			while(true);
		}
		

	}


