import java.util.Scanner;

public class PrintNthNumber{
	public static void printNumber(int num){
	
		for(int i=1;i<=num;i++){
		System.out.println( i + " ");
		}
	}
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		PrintNthNumber pn = new PrintNthNumber();
		
		int num = sc.nextInt();
		
		printNumber(num);
		}
		
	}