package Sorting;

import java.util.Scanner;

public class MergeSort {
	
	public static int [] Merge(int numArr[],int start,int end,int mid) {
		int lengthLeftArray = mid-start+1;
		int lengthRightArray = end - mid;
		
		int leftArray[] = new int[lengthLeftArray];
		int rightArray[] = new int[lengthRightArray]; 
		int k=start;
		for(int i=0;i<lengthLeftArray;i++) {
			leftArray[i]=numArr[k];
			k++;
		}
		k=mid+1;
		for(int j=0;j<lengthRightArray;j++) {
			rightArray[j]=numArr[k];
			k++;
		}
		
		int i=0;
		int j=0;
		k=start;
		
		while(i<lengthLeftArray && j<lengthRightArray) {
			if(leftArray[i]<=rightArray[j]) {
				numArr[k]=leftArray[i];
				i++;
			}else {
				numArr[k]=rightArray[j];
				j++;
			}
			k++;
		}
		
		while(i<lengthLeftArray) {
			numArr[k]=leftArray[i];
			i++;
			k++;
		}
		
		while(j<lengthRightArray) {
			numArr[k]=rightArray[j];
			j++;
			k++;
		}
		return numArr;
	}

	public static int[] mergeSort(int numArr[],int start,int end) {
		
		int s=start;
		int e=end;
		
		int mid;
		if(s>=e) {
			return numArr;
		}
		mid=s+(e-s)/2;
		
		mergeSort(numArr, start, mid);
		mergeSort(numArr,mid+1,end);
		return Merge(numArr,s,e,mid);
		
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How many values do you want to add.");
		int numArr[]=new int[scan.nextInt()];
		System.out.println("Add number of values in array.");
		for(int i=0;i<numArr.length;i++) {
			numArr[i]=scan.nextInt();
		}
		int start = 0;
		int end=numArr.length-1;
		int sortedArrya[]=mergeSort(numArr,start,end);
		System.out.println("Sorted Array:");
		for(int i=0;i<sortedArrya.length;i++) {
			System.out.print(sortedArrya[i]+" ");
		}
	}

}
