import Default.ConsolInput;

public class SumOfValueInArray {
	
	public static int sumOfArr(int numArr[]) {
		int sum=0;
		for(int temp = 0 ;temp< numArr.length ;temp++) {
			sum+=numArr[temp];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter the size of an array.");
		int size = ConsolInput.getInt();

		System.out.println("Please enter values on array.");

		int numArr[]=new int[size];
		for(int temp=0;temp<numArr.length;temp++) {
			
			numArr[temp] = ConsolInput.getInt();
		}
		int sum = sumOfArr(numArr);
		System.out.println("sum of array:" + sum);
	}

}
