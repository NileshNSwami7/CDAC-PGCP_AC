import java.util.Scanner;
import java.util.Arrays;
public class SortArrayAscendingOrder{

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
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Sorted Array: "+ arr[i]+ " ");
		}	
	}
}