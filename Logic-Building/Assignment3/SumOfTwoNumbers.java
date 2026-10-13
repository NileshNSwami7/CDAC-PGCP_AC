import java.util.Scanner;

public class SumOfTwoNumbers {
	
	public int sumOfTwoNumbers(int num1,int num2) {
		
		int sum = num1 + num2;
		
		return sum;
	}
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		SumOfTwoNumbers sn = new SumOfTwoNumbers();
		
		System.out.println("Enter first number.");
		int num1 = sc.nextInt();
		System.out.println("Enter first number.");
		int num2 = sc.nextInt();
		
		int sum = sn.sumOfTwoNumbers(num1,num2);
		
		System.out.println("The sum of "+num1+" and "+num2+ " is " + sum);
		
	}

}
