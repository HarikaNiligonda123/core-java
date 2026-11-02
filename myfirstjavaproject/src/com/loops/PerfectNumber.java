package com.loops;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		boolean res = perfectOrNot(num);
		if(res) {
		System.out.println("Perfect number");
		} else {
			System.out.println("Not a perfect number");
		}
		

	}
	static boolean perfectOrNot(int num) {
		boolean res=false;
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i == 0) {
				sum = sum+ i;
			}
		}
		if(sum==num) {
			res=true;
		}
		return res;
	}

}
