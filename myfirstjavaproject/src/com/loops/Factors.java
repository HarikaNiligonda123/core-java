package com.loops;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num=sc.nextInt();
		System.out.println("Factors of the given number : ");
		factor(num);
		// TODO Auto-generated method stub

	}
	static void factor(int num) {
		for(int i=1;i<=num/2;i++) {
			if(num % i ==0) {
				System.out.print(i + " ");
			}
		}
		System.out.print(num);
	}

}
