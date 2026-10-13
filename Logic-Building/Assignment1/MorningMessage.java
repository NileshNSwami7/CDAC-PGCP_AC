import java.util.Scanner;
public class MorningMessage{

	public static void main(String args[]){
		
		Scanner sc  = new Scanner(System.in);
		double time = sc.nextDouble();
		System.out.println("Enter your time:")
		if(time>=5 && time<=12){
			System.out.println("Good Morning");
		}else{
			System.out.println("Wrong timing");
		}
	}
}