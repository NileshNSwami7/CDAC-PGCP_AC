import java.util.Scanner;

public class PositiveNumber {

	public static void askForPositiveNumber(){
		
		Scanner sc  = new Scanner(System.in); 
		int num;
		System.out.println("Enter positive number");

		do {
			num = sc.nextInt();
			if(num>0) {
				System.out.println("You enter positive number "+num);
			}else {
				System.out.println("Enter positive number");
			}
			
		}while(num<=0);
		
	}
	public static void main(String[] args) {
	
		askForPositiveNumber();
	}

}
