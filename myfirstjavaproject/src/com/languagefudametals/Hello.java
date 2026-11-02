package com.languagefudametals;

import java.util.Scanner;

public class Hello {
	static String Hello(String msg) {
		return msg;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("main method started");
		System.out.println("Enter msg to display : ");
		String str = sc.next();
		System.out.println(Hello(str));
		System.out.println("main method ended");
		
		

	}

}
