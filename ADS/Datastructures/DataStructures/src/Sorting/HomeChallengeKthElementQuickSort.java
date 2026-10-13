package Sorting;

import java.util.Random;
import java.util.Scanner;

public class HomeChallengeKthElementQuickSort {
	
	public static int[] quickSorting(int arr[],int start,int end) {
		while(start>=end) {
			return arr;
		}
		
		int pivotIndex = partitioning(arr, start, end);
		quickSorting(arr, start, pivotIndex-1);
		quickSorting(arr, pivotIndex+1,end);
		return arr;
	}

	public static int quickSort(int arr[],int start,int end,int k) {
		
		int targetIndex = k-1;
		
		while(start<=end) {
			int pivotIndex = partitioning(arr,start,end);
			
			if(pivotIndex == targetIndex) {
				return arr[targetIndex];
			}
			if(targetIndex<pivotIndex) {
				end=pivotIndex-1;
			}else {
				start=pivotIndex+1;
			}
		}
		
		return -1;
	}
	public static int partitioning(int arr[],int start,int end) {
		Random rd = new Random();
		int index =start + rd.nextInt(end-start+1);
		
		int temp2 = arr[start];
		arr[start] = arr[index];
		arr[index] = temp2;
		
		int pivotElement = arr[start];
		
		int count = 0;
		for(int i=start+1;i<=end;i++) {
			if(arr[i]<pivotElement) {
				count++;
			}
		}
		
		int correctPosition = start + count;
		int temp = arr[start];
		arr[start]=arr[correctPosition];
		arr[correctPosition]=temp;
		
		int i=start;
		int j=end;
		while(i<correctPosition && j>correctPosition) {
			
			while(arr[i]<=pivotElement) {
				i++;
			}
			while(arr[j]>pivotElement) {
				j--;
			}
			
			if(i<correctPosition && j>correctPosition) {
				int temp1 = arr[i];
				arr[i]=arr[j];
				arr[j]=temp1;
				i++;
				j--;
			}
		}
		return correctPosition;
	}
	
	public static void display(int sortedArray[]) {
		for(int i=0;i<sortedArray.length;i++) {
			System.out.print(sortedArray[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How mnay element do you want add.");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter the elements.");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Ente Kth value.");
		int k =scan.nextInt();
		int start=0;
		int end=arr.length-1;
		if(k<1||k>arr.length) {
			System.out.println("Value is invalid.");
		}else {
			int[] sortedArray=quickSorting(arr,start,end);
			display(sortedArray);
			int result = quickSort(arr,start,end,k);
			System.out.println(k+" -the lement is : "+result);
		}
		scan.close();
	}
}
