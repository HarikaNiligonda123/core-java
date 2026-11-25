package com.Arrays;

import java.util.Arrays;

public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The product of an array is : ");
		int[] arr = {1,2,3,4,5};
		int[] res= new int[arr.length];
//		for(int i=0;i<arr.length;i++) {
//			int p=1;
//			for(int j=0;j<arr.length;j++) {
//				if(i!=j) {
//					p = p*arr[j];
//				}
//			}
//			res[i]=p;
//		}
//		System.out.println(Arrays.toString(res));
		
		int p=1;
		for(int i=0;i<arr.length;i++) {
			p = p*arr[i];
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(p/arr[i] +" ");
		}
		
		
		
	}

}
