import java.util.Scanner;

public class PrintMultiplicationTable{

	public void printMultiPlicationTable(int num){
		
		for(int i=1;i<=10;i++){
		
		System.out.println(num + "x" + i + "=" + (num*i));
		}
	}

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		PrintMultiplicationTable pmt = new PrintMultiplicationTable();
		System.out.println("Please Enter the number: ");
		int num = sc.nextInt();
		pmt.printMultiPlicationTable(num);
		}
}