package com.languagefudametals;

import java.util.Scanner;

public class PositiveOrNegativeUsingTernary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		int a=10;
		int b=30;
		int c=20;
		String res = (num>0)&&(num!=0)?"positive":(num<0)&&(num!=0)?"negative":"zero";
		System.out.println(res);
		

	}

}
