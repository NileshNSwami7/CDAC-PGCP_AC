import Default.ConsolInput;

public class CalculateAvg {
	
	public static double calculateAvg(int numArr[]) {
		int sum=0;
		double avg;
		for (int num:numArr) {
			sum+=num;
		}
		
		return avg = sum/numArr.length;
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
		double avg = calculateAvg(numArr);
		System.out.println("Avarage: " + avg);
	}

}
