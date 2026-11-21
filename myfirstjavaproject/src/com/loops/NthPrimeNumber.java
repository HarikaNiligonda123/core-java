package com.loops;

import java.util.Scanner;

public class NthPrimeNumber {
	static boolean isprime(int n) {
		boolean flag = true;
		if(n==0 || n==1) flag=false;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				flag=false;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n=sc.nextInt();
		int c=0;
		for(int i=0;i<Integer.MAX_VALUE;i++) {
		if(isprime(i)) {
			c++;
			if(c==n) {
				System.out.println("Nth prime is : " + i);
				break;
			}
		}
		}
		
		// TODO Auto-generated method stub

	}

}
