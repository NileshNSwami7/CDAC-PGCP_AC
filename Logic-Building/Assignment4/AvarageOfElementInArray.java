import java.util.Scanner;

public class AvarageOfElementInArray{

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");

		int num = sc.nextInt();
		int arr[] = new int[num];
		float avarage;
		int sum=0;
		System.out.println("Please Enter "+num+ " a numbers in array:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int n : arr){
			sum += n;
		}
		avarage=sum/num;
		System.out.println("The avarage of the number is:" +avarage);
		
	}
}