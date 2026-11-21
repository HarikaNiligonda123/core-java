package com.Arrays;

import java.util.Scanner;

public class PositiveAndNegativeCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int n=sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int p_count=0;
		int n_count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]>0) {
				p_count++;
			} else {
				n_count++;
			}
		}
		System.out.println("positive count : " +p_count);
		System.out.println("negative count : " +n_count);

	}

}
