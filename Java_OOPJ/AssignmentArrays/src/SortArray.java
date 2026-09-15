
import Default.ConsolInput;

public class SortArray {

	public static void sortArray(int numArr[]) {
		int temp;
		for (int i = 0; i < numArr.length; i++) {
			for (int j = i; j < numArr.length; j++) {

				if (numArr[i] > numArr[j]) {
					temp = numArr[j];
					numArr[j] = numArr[i];
					numArr[i] = temp;

				}
			}
		}

		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Pleanse enter the size of array:");
		int size = ConsolInput.getInt();
		int numArr[] = new int[size];

		System.out.println("Please enter the element in the array.");
		for (int temp = 0; temp < numArr.length; temp++) {
			numArr[temp] = ConsolInput.getInt();
		}
		System.out.println("Please enter the element in the array.");
		for (int temp = 0; temp < numArr.length; temp++) {
			System.out.print(numArr[temp] + " ");
		}
		System.out.println();
		System.out.println("Array after sort:");
		sortArray(numArr);
		
	
		
	}

}
