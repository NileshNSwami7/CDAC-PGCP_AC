
public class SeventhNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Seventh Number: ");
		int num;
		for(int start=1;start<200;start++) {
			
			num = start * 7;
			if(num<200)
			System.out.print( num +", ");
			else
				break;
		}
	}

}
