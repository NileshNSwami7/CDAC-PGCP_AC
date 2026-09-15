
public class OddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Odd Number : ");
		for(int start=0;start<1000;start++) {
			if(start%2==0) 
				continue;
			else
				System.out.print(start+", ");
		}

	}

}
