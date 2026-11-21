package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RemovingDuplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int n=sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			boolean res=false;
			for(int j=0;j<i;j++) {
				if(i!=j && arr[i]==arr[j]) {
					res=true;
					break;
				}
				
			}
			if(res==false) {
				System.out.print(arr[i] +" ");
			}
		}
		// TODO Auto-generated method stub

	}

}
