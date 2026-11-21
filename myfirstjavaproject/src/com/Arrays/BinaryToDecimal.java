package com.Arrays;

import java.util.Scanner;

public class BinaryToDecimal {

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
			int count=0;
			int sum=0;
			while(num>0) {
				int rem = num%10;
				sum += rem*Math.pow(2,count); //110 rem=0,sum=0, sum =0*2 = 0;
				count++;
				num=num/10;
			}
			System.out.print(sum + " ");
		}

	}

}
