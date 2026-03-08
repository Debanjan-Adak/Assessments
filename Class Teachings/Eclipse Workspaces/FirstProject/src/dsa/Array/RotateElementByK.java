package dsa.Array;

public class RotateElementByK {

	static void reverse(int[] arr, int l, int r) {
		while (l <= r) {
			int temp = arr[l];
			arr[l++] = arr[r];
			arr[r--] = temp;
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int k=3;
		reverse(arr,0,arr.length-k-1);
		reverse(arr,arr.length-k,arr.length-1);
		reverse(arr,0,arr.length-1);
		
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}
}
