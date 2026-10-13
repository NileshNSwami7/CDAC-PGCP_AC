package Recursion;

import java.util.Scanner;

public class BinaryStrings {

	public static void generateStrings(char arr[], int index, int n, int previous) {

		// String is complete
		if (index == n) {
			System.out.println(new String(arr));
			return;
		}

		// Put 0
		arr[index] = '0';

		generateStrings(arr, index + 1, n, 0);

		// Put 1 only if previous was not 1
		if (previous == 0) {

			arr[index] = '1';

			generateStrings(arr, index + 1, n, 1);
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter n:");
		int n = scan.nextInt();

		char arr[] = new char[n];

		generateStrings(arr, 0, n, 0);

		scan.close();
	}
}