package com.Arrays;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int key=sc.nextInt();
		boolean found=false;
		for(int i=0;i<n;i++) {
			if(arr[i]==key) {
				found=true;
				break;
			}
		}
		if(found) {
			System.out.println("key present in my array");
		} else {
			System.out.println("Not found");
		}
	}

}
