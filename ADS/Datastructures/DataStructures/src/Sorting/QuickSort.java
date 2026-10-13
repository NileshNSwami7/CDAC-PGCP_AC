package Sorting;

import java.util.Scanner;


public class QuickSort {
	
	public static int[] quickSort(int numArr[],int start,int end) {
		if(start>=end) {
			return numArr;
		}
		int pivotIndex=partitioning(numArr,start,end);
		quickSort(numArr,start,pivotIndex-1);
		quickSort(numArr,pivotIndex+1,end);
		
		return numArr;
	}

	private static int partitioning(int[] numArr, int start, int end) {
		
		int pivolElement = numArr[start];
		 int count=0;
		 for(int i=start+1;i<=end;i++) {
			 if(numArr[i]<=pivolElement) {
				 count++;
			 }
		 }
		int correctPosition = start + count;
		
		int temp = numArr[correctPosition];
		numArr[correctPosition] = numArr[start];
		numArr[start] = temp;
		
		int i=start;
		int j=end;
		
		while(i<correctPosition && j>correctPosition) {
			while(numArr[i]<=pivolElement) {
				i++;
			}
			while(numArr[j]>pivolElement) {
				j--;
			}
			
			if(i<correctPosition && j>correctPosition) {
				int temp1 = numArr[i];
				numArr[i] = numArr[j];
				numArr[j] = temp1;
				i++;
				j--;
			}
		}
		return correctPosition;
	}

	public static void main(String[] args) {
		
		Scanner scan  = new Scanner(System.in);
		System.out.println("How many of element do you want to add.");
		int numArr[]=new int[scan.nextInt()];
		System.out.println("Add elements.");
		for(int i=0;i<numArr.length;i++) {
			numArr[i]=scan.nextInt();
		}
		int start =0;
		int end=numArr.length-1;
		
		int arr[]=quickSort(numArr,start,end);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
