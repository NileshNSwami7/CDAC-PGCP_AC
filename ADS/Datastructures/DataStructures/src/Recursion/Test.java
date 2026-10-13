package Recursion;
public class Test{
	
	public static void printbinary(int num) {
		if(num>1) {
			printbinary(num/2);
		}
		System.out.print(num%2);
	}
	public static void main(String args[]) {
		printbinary(13);
	}
}