import java.util.Scanner;

public class PrintArray{

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");

		int num = sc.nextInt();
		int arr[] = new int[num];
		System.out.println("Please Enter "+num+ " a numbers in array:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int n : arr){
		System.out.print(n+ " ");
		}
	}
}