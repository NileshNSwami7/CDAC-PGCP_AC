import java.util.Scanner;

public class CheckAge {

	public void checkAgeCategory(int age) {
		 if(age<18) {
			 System.out.println("You are minor");
		 }else if(age>18 && age<60) {
			 System.out.println("You are adult");
		 }else {
			 System.out.println("You are Senior Citizen");
		 }
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		CheckAge ca = new CheckAge();
		
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		ca.checkAgeCategory(age);
	}

}
