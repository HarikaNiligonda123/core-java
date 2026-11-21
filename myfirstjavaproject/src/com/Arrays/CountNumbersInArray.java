package com.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CountNumbersInArray {
	static void CountUsingBoolean(int[] arr,int n) {
		boolean[] res=new boolean[n];
		Arrays.fill(res, false);
		for(int i=0;i<n;i++) {
			int count=0;
			if(res[i]=true) continue;
			else res[i]=true;
			for(int j=0;j<n;j++) {
				if(res[i]==res[j]) {
					count++;
					res[j]=true;
				}
			}
			System.out.print(arr[i] +"-> " +count);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     int n=sc.nextInt();
     int[] arr = new int[n];
     for(int i=0;i<n;i++) {
    	 arr[i]=sc.nextInt();
     }
     ArrayList<Integer> lst = new ArrayList<>();
     for(int i=0;i<n;i++) {
    	 int cnt = 0;
    	 boolean res=false;
    	 for(int j=0;j<n;j++) {
    		 if(arr[i]==arr[j] && !lst.contains(arr[i])) {
    			 cnt++;
    			 res=true;
    		 }
    	 }
    		 lst.add(arr[i]);
    		 if(res) {
    			 System.out.println(arr[i] +"-> "+cnt);
    		
    	 }
     }
     CountUsingBoolean(arr,n);
	}

}
