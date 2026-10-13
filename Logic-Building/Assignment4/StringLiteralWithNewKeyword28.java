import java.util.Scanner;

public class StringLiteralWithNewKeyword28{

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		String str1 = new String("hello");
		String str2 = new String("hello");
		boolean check = (str1 == str2);
		boolean check1 = str1.equals(str2);
		if(check){
		System.out.println("Using == "+check);
		}else{
		System.out.println("Using == "+check);
		}	
		if(check1){
		System.out.println("Using .equals(): "+check1);
		}else{
		System.out.println("Using .equals(): "+check1);
		}			
	}
}