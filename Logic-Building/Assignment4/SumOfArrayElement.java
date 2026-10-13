import java.util.Scanner;

public class SumOfArrayElement{

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");

		int num = sc.nextInt();
		int arr[] = new int[num];
		int sumofElements=0;
		System.out.println("Please Enter "+num+ " a numbers in array:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int n : arr){
			sumofElements+=n;
		}
		System.out.print("The Sum of all elements numbers:" +sumofElements);

	}
}