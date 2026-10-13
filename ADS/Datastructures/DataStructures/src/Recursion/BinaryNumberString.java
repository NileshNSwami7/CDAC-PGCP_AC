package Recursion;

import java.util.Scanner;

public class BinaryNumberString {
	
	public static void geneteBinary(char arr[],int index,int n,int previous) {
		if(index == n) {
			System.out.println(new String(arr));
			return;
		}
		
		arr[index]='0';
		
		geneteBinary(arr,index+1,n,0);
		
		if(previous == 0) {
			arr[index]='1';
			geneteBinary(arr, index+1, n, 1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n ");
		int n = sc.nextInt();
		char arr[] = new char[n];
		geneteBinary(arr,0,n,0);
		sc.close();
	}

}
