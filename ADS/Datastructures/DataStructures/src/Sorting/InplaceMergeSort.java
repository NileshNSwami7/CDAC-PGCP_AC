package Sorting;

import java.util.Scanner;

public class InplaceMergeSort {
	
	public static int[] mergeInplace(int numArr[],int start,int end,int mid) {
		int i= start;
		int j= mid+1;
		
		while(i<=mid && j<=end) {
			if(numArr[i]<=numArr[j]) {
				i++;
			}else {
				int value = numArr[j];
				int k=j;
				while(k>i) {
					numArr[k] = numArr[k-1];
					k--;
				}
				numArr[i]=value;
				i++;
				mid++;
				j++;
			}
		}
		return numArr;
	}
	
	public static int[] mergeSort(int numArr[],int start,int end) {
		if(start>=end) {
			return numArr;
		}
		
		int mid = start+(end-start)/2;
		
		mergeSort(numArr, start,mid);
		mergeSort(numArr,mid+1,end);
		return mergeInplace(numArr,start,end,mid);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many elements do you want to add.");
		int numArr[] = new int [scan.nextInt()];
		System.out.println("Please and the elements.");
		for (int i= 0; i<numArr.length;i++) {
			numArr[i]=scan.nextInt();
		}
		int start=0;
		int end=numArr.length-1;
		int arr[]=mergeSort(numArr,start,end);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
