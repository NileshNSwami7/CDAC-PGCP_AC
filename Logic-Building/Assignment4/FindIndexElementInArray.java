import java.util.Scanner;
import java.util.Arrays;
public class FindIndexElementInArray{

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
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Please enter number,Which do you want to check.");
		int n = sc.nextInt();
		
		int index = Arrays.binarySearch(arr,n); 
		System.out.println("The number "+n+" is found at index "+index);
		
			
	}
}