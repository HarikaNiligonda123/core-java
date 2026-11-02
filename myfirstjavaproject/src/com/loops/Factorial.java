package com.loops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int fact = factorial(num);
		System.out.println("factorial of the given number : " + fact);
		int factrec = Recfact(num);
		System.out.println("factorial using rec : " + factrec);

	}
	static int factorial(int num) {
		int fact = 1;
		for(int i=num;i>0;i--) {
			fact = fact*i;
		}
		return fact;
	}
	static int Recfact(int num) {
		if(num<=0) return 1;
		return num*Recfact(num-1);
	}

}
