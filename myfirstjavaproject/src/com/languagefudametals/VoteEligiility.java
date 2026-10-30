package com.languagefudametals;

import java.util.Scanner;

public class VoteEligiility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age : ");
		int age = sc.nextInt();
		if(age >0 ) {
			if(age >= 18) {
				System.out.println("Do you hold indian citizenship : ");
				boolean is_Indian_citizenship = sc.nextBoolean();
				
				if(is_Indian_citizenship) {
					System.out.println("Do you have voter ID : ");
					boolean voterID = sc.nextBoolean();
					if(voterID) {
						System.out.println(" Congratulations!! you are Eligible to vote");
						System.out.println("please caste your valuable vote");
					} else {
						System.out.println("Voter ID is required");
					}
				} else {
					System.out.println("Not eligile to vote");
				}
			} else {
				System.out.println("Not eligile for vote");
			}
			
		} else {
			System.out.println("Invalid age");
		}

	}

}
