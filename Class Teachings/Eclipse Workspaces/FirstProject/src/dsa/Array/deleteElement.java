package dsa.Array;

public class deleteElement {
	public static void main(String[] args) {
		int element = 2, pos = 3, pos2 = -1;
		int arr[] = { 1, 2, 3, 4, 5 };
		int i = 0;
		if (pos < arr.length) {
			for (i = pos; i < arr.length - 1; i++) {
				arr[i] = arr[i + 1];
			}
		} else
			System.out.println("Wrong Input");

		arr[i] = 0;

		for (i = 0; i < arr.length - 1; i++)
			System.out.println(arr[i]);
		for (i = 0; i < arr.length - 1; i++) {
			if (arr[i] == element) {
				pos2 = i;
				break;
			}

		}
		for (i = pos2; i < arr.length - 1; i++)
			arr[i] = arr[i + 1];

		arr[i] = 0;

	}
}
