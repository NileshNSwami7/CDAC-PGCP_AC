import java.util.Scanner;

public class MultipleStrinLiterrals31{

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		String str1 = "hello";
		String str2 = "hello";
		String str3 = "hello";
		
	
		
		boolean check = (str2 == str3)&&(str1 == str2);
		if(check){
			System.out.println("All object pointing to the same object? "+check);
		}else{
			System.out.println("All object pointing to the same object? "+check);
		}			
	}
}