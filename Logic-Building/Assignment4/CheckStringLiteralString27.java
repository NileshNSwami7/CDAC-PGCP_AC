import java.util.Scanner;

public class CheckStringLiteralString27{

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		String str = "hello";
		String st= "hello";
	
		if(str == st){
		System.out.println("Both variable poiting to the same Objcet true");
		}else{
		System.out.println("Both variable poiting to the same Objcet false");
		}		
	}
}