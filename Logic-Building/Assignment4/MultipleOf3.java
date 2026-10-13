import java.util.Scanner;

public class MultipleOf3{

	public static void multipleNumber3(int num){
	
		for(int i=1;i<num;i++){
		
			if(i%3==0)
			{
				System.out.print( ( i )+" ");
			}
		}
	}
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");

		int num = sc.nextInt();
		
		multipleNumber3(num);
		}
		
	}