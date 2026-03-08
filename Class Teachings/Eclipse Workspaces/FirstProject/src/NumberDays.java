import java.util.Scanner;

public class NumberDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of the month");
		int value=sc.nextInt();
		sc.nextLine();
		switch (value) {
		case 2: 
			System.out.println("Enter Year");
			int year=sc.nextInt();
			sc.nextLine();
			if(year%400==0 || year%4==0 && year%100!=0)
			{
				System.out.println("29");
			}
			else
				System.out.println("28");
			break;
		
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31 days");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30 days");
			break;
			
		default:
			System.out.println("wrong input");
		}
	}

}
