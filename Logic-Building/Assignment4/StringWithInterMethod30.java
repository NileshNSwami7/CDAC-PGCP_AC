import java.util.Scanner;

public class StringWithInterMethod30{

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		String str1 = new String("hello");
		String str2 = str1.intern();
		String str3= "hello";
		
	
		
		boolean check = (str2 == str3);
		if(check){
			System.out.println("Is str2 and str 3 is pointing to the same object? "+check);
		}else{
			System.out.println("Is str2 and str 3 is pointing to the same object? "+check);
		}			
	}
}