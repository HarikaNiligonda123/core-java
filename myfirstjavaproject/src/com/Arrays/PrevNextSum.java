package com.Arrays;

import java.util.Arrays;

public class PrevNextSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,50,60};
		int[] res = new int[arr.length];
		int prev=0;
		int next=0;
		for(int i=0;i<arr.length;i++) {
			int curSum=0;
			if(i==0) {
				 prev=arr[i];
				next = arr[i+1];
				curSum = prev+next;
				res[i] = curSum;
			}
			else if(i==arr.length-1) {
				prev=arr[i-1];
				next=arr[i];
				curSum=prev+next;
				res[i]=curSum;
			}else {
			prev=arr[i-1];
			next=arr[i+1];
			curSum=prev+next;
			res[i]=curSum;
			}
			System.out.print(res[i] +" ");
		}
		//System.out.println(Arrays.toString(res));
	}

}
