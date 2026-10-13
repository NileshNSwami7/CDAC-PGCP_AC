import java.util.Scanner;

public class StringConcatination29{

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		String str1 = "hello";
		String str2 = "world";
		String str3= str1+str2;
		
		System.out.println(str3);
		boolean check = (str1 == str3);
		if(check){
			System.out.println("Is str3 is pointing to the same object as str1 ? "+check);
		}else{
			System.out.println("Is str3 is pointing to the same object as str1 ? "+check);
		}			
	}
}