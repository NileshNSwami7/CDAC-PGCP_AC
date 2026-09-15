import Default.ConsolInput;

public class CopyArray {
	
	public static void copyArray(int numArr[]) {

		int copArry[] = new int[numArr.length];
		for (int i = 0; i < numArr.length; i++) {

			copArry[i] = numArr[i];
		}
		
		System.out.print("Copied Array: ");
		
		for (int i = 0; i < copArry.length; i++) {

			System.out.print(copArry[i]+", ");
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
		System.out.println("Array before copy");
		for (int temp = 0; temp < numArr.length; temp++) {
			System.out.print(numArr[temp]+", ");
		}
		System.out.println();
		copyArray(numArr);

	}

}
