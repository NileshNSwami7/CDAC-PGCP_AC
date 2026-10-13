import java.util.Scanner;

public class SumOfOddNumber{

	public static void multipleNumber3(int num){
		
		int sum=0;
		for(int i=0;i<=num;i++){
		
			if(i%2!=0)
			{
				sum+=i;
			}
		}
		System.out.println("The sum of the odd number from "+1+ " to " +num+ " " +sum);
	}
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");

		int num = sc.nextInt();
		
		multipleNumber3(num);
		}
		
	}