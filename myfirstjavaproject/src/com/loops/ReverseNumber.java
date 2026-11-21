package com.loops;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num : ");
		int num=sc.nextInt();
		int revnum =0;
		while(num>0) {
			int r=num%10;
			num = num/10;
			revnum = 10*revnum+r;
		}
		System.out.println( "reverse of a number: " + revnum);

	}

}
