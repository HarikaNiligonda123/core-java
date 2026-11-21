package com.Arrays;

import java.util.Scanner;

public class DecimalToBinaryInArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int n=sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			int num=arr[i];
			String res = "";
			while(num>0) {
				int rem = num%2;
				res = rem+res;
				num=num/2;
			}
			System.out.print(res +" ");
		}

	}

}
