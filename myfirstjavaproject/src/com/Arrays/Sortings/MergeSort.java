package com.Arrays.Sortings;

import java.util.Arrays;

public class MergeSort {
	static void divide(int[] arr) {
		if(arr.length==1) {
			return;
		}
		int[] left = new int[arr.length/2];
		int[] right=new int[arr.length-left.length];
		for(int i=0;i<left.length;i++) {
			left[i]=arr[i];
		}
		for(int i=0;i<right.length;i++) {
			right[i]=arr[arr.length-left.length+i];
		}
		divide(left);
		divide(right);
		merge(arr,left,right);

	}
	static void merge(int[] arr,int[] left,int[] right) {
		int i=0;
		int j=0;
		int k=0;
		while(i<left.length && j<right.length) {
			if(left[i]<right[j]) {
				arr[k++]=left[i++];
			} else {
				arr[k++]=right[j++];
			}
		}
		while(i<left.length) {
			arr[k++]=left[i++];
		}
		while(j<right.length) {
			arr[k++]=right[j++];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {40,30,20,10};     
		// first we need to divide the array into two atmost equal parts as left  and right arrays after dividing we need to merge the array by comparing each and every element.
		divide(arr);
		System.out.println(Arrays.toString(arr));
		
	}

}
