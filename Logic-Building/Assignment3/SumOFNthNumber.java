import java.util.Scanner;

public class SumOFNthNumber{

	public void calculateSum(int num){
		int sum=0;
		for(int i=0; i<=num; i++){
			sum+=i;
		}
		System.out.println("The sum of numbers from 1 to " +num+ " is : " + sum);	
	}

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		SumOFNthNumber sn = new SumOFNthNumber();
		
		System.out.println("Enter a number: ");
		
		int num = sc.nextInt();
		
		sn.calculateSum(num);
	}
}
	