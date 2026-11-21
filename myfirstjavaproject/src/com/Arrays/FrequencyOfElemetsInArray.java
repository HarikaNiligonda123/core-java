package com.Arrays;

import java.util.Scanner;

public class FrequencyOfElemetsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of an array : ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		boolean vis[] = new boolean[n];
		for(int i=0;i<n;i++) {
			int c=0;
			if(vis[i]==true) continue;
			vis[i]=true;
			for(int j=0;j<n;j++) {
				if(arr[i]==arr[j]) {
					vis[j]=true;
					c++;
				}
			}
			System.out.println(arr[i] + " ->" + c);
		}

	}

}
