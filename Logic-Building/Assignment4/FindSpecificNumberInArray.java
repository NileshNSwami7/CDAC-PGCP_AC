import java.util.Scanner;
import java.util.Arrays;
public class FindSpecificNumberInArray{

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");

		int num = sc.nextInt();
		Integer arr[] = new Integer[num];
		
		System.out.println("Please Enter "+num+ " a numbers in array:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Please enter number,Which do you want to check.");
		int n = sc.nextInt();
		
			boolean found = Arrays.asList(arr).contains(n); // for using Arrays.asList() its an Object with so we have to take wrapper Integer array.

			if(found == true){
				System.out.print("Found");
			}else{
				System.out.print("NotFound");
			}
			
	}
}