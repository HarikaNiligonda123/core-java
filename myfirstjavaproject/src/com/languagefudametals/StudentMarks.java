package com.languagefudametals;

import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks : ");
		double marks = sc.nextDouble();
		if(marks >=90 && marks<=100) {
			System.out.println("A Grade");
		} else if(marks >= 80 && marks <=89) {
			System.out.println("B Grade");
		} else if(marks >= 70 && marks <= 79) {
			System.out.println("C Grade");
		} else if(marks >= 60 && marks <= 69) {
			System.out.println("D Grade");
		} else {
			System.out.println("Fail");
		}
	}

}
