package com.languagefudametals;

import java.util.Scanner;

public class ElectricBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the connection type :\n 1.Domestic \n 2.Commericial");
		String connection=sc.nextLine();
		int total_bill =0;
		switch(connection) {
		case "Domestic" : {
			System.out.println("Enter the units : ");
			int units = sc.nextInt();
			if(units >0 && units <100) {
				int price =2;
				total_bill = units*price;
			} else {
				int price = 3;
				total_bill = units*price;
			}
			//System.out.println(" domestic total bill : "+ total_bill);
			break;
			
		}
		case "Commericial" : {
			System.out.println("Enter the units : ");
			int units=sc.nextInt();
			if(units >0 && units <=100) {
				int price=4;
				total_bill = units*price;
			} else if(units>100 && units <=300) {
				int price = 6;
				total_bill = units*price;
			} else {
				int price =8;
				total_bill = units*price;
			}
			//System.out.println(" commericial total bill : " + total_bill);
			break;
		}
		default : System.out.println("connection type is not found");
		
		
		}
		System.out.println("Total bill : " + total_bill + " rs");

	}

}
