package com.Arrays;

import java.util.Scanner;

public class EvenOddCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int n=sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int e_count=0;
		int o_count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				e_count++;
			} else {
				o_count++;
			}
		}
		System.out.println("Even  count : " +e_count);
		System.out.println("Odd  count : " +o_count);
	}

}
