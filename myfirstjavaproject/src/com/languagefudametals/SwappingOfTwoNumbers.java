package com.languagefudametals;

import java.util.Scanner;

public class SwappingOfTwoNumbers {
	static void swapwithThirdVariable(int a,int b) {
		int temp = a;
		a=b;
		b=temp;
		System.out.println(" A is : " + a + " B is : " + b);
	}
	static void swapwithoutThirdVariable(int a,int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("A is : " + a + " B is : " + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value : ");
		int a = sc.nextInt();
		System.out.println("Enter b value : ");
		int b=sc.nextInt();
		swapwithThirdVariable(a,b);
		swapwithoutThirdVariable(a,b);
		

	}

}
