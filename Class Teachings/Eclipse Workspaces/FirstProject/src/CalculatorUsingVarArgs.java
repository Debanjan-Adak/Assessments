import java.util.ArrayList;
import java.util.Scanner;

public class CalculatorUsingVarArgs {
	
	private static void add(int ... nums)
	{
		
	}

	public static void main(String[] args) {
		
		int n;
		ArrayList<Integer> values= new ArrayList<>();
		System.out.println("Enter the elements to be added, press 0 to exit");
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			int x=sc.nextInt();
			if(x!=0)
			values.add(x);
		}
	}

}
