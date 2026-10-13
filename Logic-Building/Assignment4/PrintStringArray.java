import java.util.Scanner;

public class PrintStringArray{

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");

		int num = sc.nextInt();
		String str[] = new String[num];
		System.out.println("Please Enter "+num+ " a names in array:");
		for(int i=0;i<str.length;i++)
		{
			str[i]=sc.next();
		}
		System.out.println("*******************");
		for(String s : str){
		System.out.println(s);
		}

	}
}