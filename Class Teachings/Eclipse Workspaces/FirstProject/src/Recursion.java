import java.io.Console;
import java.util.Scanner;

public class Recursion {

	 
	
	static
	{
		System.out.println("hello static hello");
		main(new String[]{"string"});
	}
	public static int printer() {
		System.out.println("Printer function");
		return 0;
	}
//	private static void printStars(int count)//when to stop
//	{
//		System.out.println(count);
//		System.out.println("*");
//		if(count == 0)
//		return;
//		
//		
//		printStars(--count);
//	}
//	
//	private static void starPrinter(int count)//till what to continue 2 DIfferent ways.
//	{
//		System.out.println("*");
//		if(--count>0)
//			starPrinter(count);
//		
//	}
	final static int a=6;
	static int ij=printer();
	final static int i=printer();
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		//printStars(5);
//		starPrinter(5);
		NonMain ob= new NonMain();
		System.out.println("in main");
		printer();
	}

}
class NonMain
{
	static
	{
		System.out.println("Non main static class");
	}
	void print()
	{
		System.out.println("Hello print");
	}
}
