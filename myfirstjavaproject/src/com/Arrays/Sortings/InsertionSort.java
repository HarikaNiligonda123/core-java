package com.Arrays.Sortings;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int n=sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array before sorting : " + Arrays.toString(arr));
		for(int i=0;i<n-1;i++) {
			int minidx=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[minidx]) {
					minidx=j;
				}
			}
			int temp =arr[i];
			arr[i]=arr[minidx];
			arr[minidx]=temp;
		}
		System.out.println("Array after sorting : " + Arrays.toString(arr));

	}

}
