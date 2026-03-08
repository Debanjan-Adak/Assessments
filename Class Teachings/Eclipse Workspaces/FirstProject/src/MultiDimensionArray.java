import java.util.Scanner;

public class MultiDimensionArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int r = sc.nextInt();
		int arr[][]=new int[r][r];
		System.out.println("Enter all the elements");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++)
				arr[i][j]=sc.nextInt();
			}
		noOfElements(arr);
	}
	private static void noOfElements(int arr[][])
	{
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
			}
		
		
	}

}
