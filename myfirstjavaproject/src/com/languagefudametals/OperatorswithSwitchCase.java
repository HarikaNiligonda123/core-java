package com.languagefudametals;

import java.util.Scanner;
public class OperatorswithSwitchCase {
	static void Addition(int a,int b) {
		int sum = a+b;
		System.out.println("Addition of two numbers : "+ sum);
	}
static void Subtraction(int a,int b) {
	int sub =a-b;
	System.out.println("Subtraction of two numbers : " + sub);
}
static void Multiplication(int a,int b) {
	int mul = a*b;
	System.out.println("Multiplication of two numbers : " + mul);
}
static void Division(int a,int b) {
	int div=a/b;
	System.out.println("Division of two numbers : " + div);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		System.out.println("Enter b number");
		int b=sc.nextInt();
		String opt = "";
		do {
			System.out.println("1.Addition\n 2.Subtraction\n 3.Multiplication\n 4.Division");
			int option = sc.nextInt();
		switch(option) {
		case 1 :
			Addition(a,b);
			break;
		case 2:
			Subtraction(a,b);
			break;
		case 3: 
			Multiplication(a,b);
			break;
		case 4:
			Division(a,b);
			break;
		default : System.out.println("Entered invalid option");
		}
		System.out.println("Do you want to continue : Y/N");
		 opt=sc.next();
		} while(opt.equalsIgnoreCase("Y"));
		System.out.println("Calculation closed as of now");

	}

}
