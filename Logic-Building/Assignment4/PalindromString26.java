import java.util.Scanner;

public class PalindromString26{

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String str = sc.next().toLowerCase();
		String st1="";
	
		for(int i=str.length()-1;i>=0;i--){
				st1 = st1 + str.charAt(i);
			
		}
		if(st1.equals(str)){
		System.out.println("String is palindrom");
		}else{
		System.out.println("String is not palindrom");
		}		
	}
}