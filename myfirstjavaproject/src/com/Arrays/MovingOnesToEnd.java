package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MovingOnesToEnd{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int n=sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int i=0,j=n-1;
		while(i<j) {
			if(arr[i]==1 && arr[j]==0) {
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			} else if(arr[i]==1 && arr[j]==1) {
				i++;
				j--;
			} else {
				i++;
			}
		}
		for(int k=0;k<n;k++) {
			System.out.print(arr[k] +" ");
		}
		
		
		
		
		for(int k=0;k<arr.length;k++) {
			for(int l=k+1;l<arr.length;l++) {
				if(arr[k]==1&&arr[l]==0) {
					int temp=arr[k];
					arr[k]=arr[l];
					arr[l]=temp;
					break;
				}
				
			}
		}
System.out.println("**"+ Arrays.toString(arr));
	}

}
