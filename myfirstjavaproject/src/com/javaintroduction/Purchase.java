package com.javaintroduction;
import java.util.Scanner;
public class Purchase {
	////static int total=450;
	public static void shop(int c,int b,int total) {
		c=c*15; 
		b=b*10;
		int sum =c+b;
		System.out.println(total-sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int c=sc.nextInt(); // c=10
		int b=sc.nextInt(); //b=5
		int total=450;
		shop(c,b,total);

	}

}
