import java.util.Scanner;

public class Factorial{

	public static void factorial(int num){
		int sum=1;
		for(int i=1;i<=num;i++){
				
				sum*=i;
		}
		System.out.println("Factorial of " +num+ " "+ sum);
	}
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");

		int num = sc.nextInt();
		
		factorial(num);
		}
		
	}