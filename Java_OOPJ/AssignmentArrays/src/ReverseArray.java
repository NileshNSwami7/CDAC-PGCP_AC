import Default.ConsolInput;

public class ReverseArray {
	
	public static void reverseArray(int numArr[]) {
		System.out.print("Reverse Array: ");
		for (int temp = numArr.length-1; temp >=0; temp--) {
			System.out.print( numArr[temp] + ", ");
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
		System.out.println();
		reverseArray(numArr);
	}

}
