import java.util.Scanner;

public class CountPositiveNegativeInArray{

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");

		int num = sc.nextInt();
		int arr[] = new int[num];
		
		int positiveCount=0;
		int negativeCount=0;

		System.out.println("Please Enter "+num+ " a numbers in array:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=0){
				positiveCount++;
			}
			else if(arr[i]<0){
				negativeCount++;
			}
		}
		System.out.println("Positive Numbers: "+positiveCount);
		System.out.println("Positive Numbers: "+negativeCount);		
	}
}