import java.util.Scanner;
public class EvenOddNumber{
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	 int number = sc.nextInt();
	 System.out.println("Please Enter your number:");
	 if(number%2==0){
		System.out.println("Even");
	 }else{
		System.out.println("Odd");
	 }
	}
}