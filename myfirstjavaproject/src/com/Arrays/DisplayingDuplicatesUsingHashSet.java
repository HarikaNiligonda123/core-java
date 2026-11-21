package com.Arrays;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DisplayingDuplicatesUsingHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int n=sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Set<Integer> hs = new HashSet<>();
		for(int num:arr) {
			if(hs.contains(num)) {
				System.out.print(num +" ");
			} else {
				hs.add(num);
			}
		}

	}

}
