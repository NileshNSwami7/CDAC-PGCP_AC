import Default.ConsolInput;

public class DuplicateNumberArray {

	public static void duplicateValue(int numArr[]) {

		System.out.print("Duplicate: ");

		for (int i = 0; i < numArr.length; i++) {
			for(int j=i;j<numArr.length-1;j++) {
				if (numArr[i] == numArr[j+1]) {
					System.out.print(numArr[i]+", ");
				}
			}
		}

	}
	
	public static void main(String args[]) {
		System.out.println("Pleanse enter the size of array:");
		int size = ConsolInput.getInt();
		int numArr[] = new int[size];

		System.out.println("Please enter the element in the array.");
		for (int temp = 0; temp < numArr.length; temp++) {
			numArr[temp] = ConsolInput.getInt();
		}
		System.out.println();
		duplicateValue(numArr);
	}
}
