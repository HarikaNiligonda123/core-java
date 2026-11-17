package com.loops;

import java.util.Scanner;

public class Automorphic {
	static boolean automor(int num) {
		boolean flag=false;
		StringBuilder str = new StringBuilder();
		int temp=num*num;
		while(temp>0) {
			int rem=temp%10;
			str=str.append(rem);
			if(str.reverse().equals(num)) {
				flag=true;
				break;
			}
			temp = temp/10;
			
		}
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
//		String s= Integer.toString(num);
//		int len = s.length();
//		len = (int) Math.pow(10, len);
//		int temp=num*num;
//		int rem = temp%len;
//		if(rem==num) {
//			System.out.println("Automorphic");
//		} else {
//			System.out.println("Not Automorphic");
//		}
		
		if(automor(num)) {
			System.out.println("Automorphic");
		} else {
			System.out.println("Not a Automorphic");
		}
	}

}
