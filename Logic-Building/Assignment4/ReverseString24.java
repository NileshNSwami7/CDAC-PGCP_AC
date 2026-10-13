import java.util.Scanner;

public class ReverseString24{

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String str = sc.next();
		String st ="";
		
		for(int i =str.length()-1 ;i>=0 ;i--){
			
				st= st+str.charAt(i);
		}
		System.out.println(st);
	}
}