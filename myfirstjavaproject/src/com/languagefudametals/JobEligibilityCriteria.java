package com.languagefudametals;

import java.util.Scanner;

public class JobEligibilityCriteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter your Full name : ");
		String fname = sc.nextLine();

		System.out.println("Please enter your passed out year : ");
		int yearOfPass = sc.nextInt();

		if (yearOfPass > 2024 && yearOfPass <= 2026) {
			System.out.println("ok ! please enter your qualification : ");
			String qualification = sc.next();
			sc.nextLine();
			System.out.println("Please enter your Branch : ");
			String Branch = sc.nextLine();
				
			if(qualification.equalsIgnoreCase("BE") && Branch.equalsIgnoreCase("CSE")) {
				System.out.println("Enter your CGPA : ");
				double cgpa = sc.nextDouble();
				if (cgpa >= 7.5) {
					System.out.println("Enter your skill set : ");
					String skill = sc.next();
					if (skill.equals("Java") || skill.equals("Python") || skill.equals("C++")) {
						System.out.println("You are eligible for the written test");
						System.out.println("Congratulations !! we will get back to you soon for further Instructions " + fname);
					} else {
						System.out.println("sorry! you are not eligible at this stage o through");
					}
				}
			} else {
				System.out.println("sorry! you are not considered any more");
			}

		} else {
			System.out.println("you are not eligible for this position");
		}

	}

}
