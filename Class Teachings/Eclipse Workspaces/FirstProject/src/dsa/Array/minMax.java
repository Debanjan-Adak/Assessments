package dsa.Array;

public class minMax {
	public static void main(String[] args) {
//		System.out.println("Hello");
		int arr[] = { 2, 4, 23, 56, 34, 89, 12, 56, 34, 76, 87 };
		int max = arr[0], min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
			if (arr[i] < min)
				min = arr[i];
		}
		System.out.println("Max : " + max + " Min : " + min);
	}
}
