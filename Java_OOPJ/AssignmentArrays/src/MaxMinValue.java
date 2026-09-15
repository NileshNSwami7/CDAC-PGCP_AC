import Default.ConsolInput;

public class MaxMinValue {
	
	public static void maxMinValue(int numArr[]) {
		int max = numArr[0];
		int min = numArr[0];

		for (int i = 0; i < numArr.length; i++) {
			if (max < numArr[i]) {
				max = numArr[i];
			}
			if (min > numArr[i]) {
				min = numArr[i];
			}
		}

		System.out.println("Max: " + max + " Min: " + min);
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
		System.out.println();
		maxMinValue(numArr);
	}

}
