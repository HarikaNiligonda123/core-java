package com.languagefudametals;

import java.util.Scanner;

public class FoodOrderingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("welcome!!");
		int total_bill=0;
		String yn="";
		
		do {
			//String yn="";
		System.out.println("Enter the option in menu : ");
		System.out.println("1.pizza - 200 \n2.burger - 120 \n3.biryani - 180 \n4.noodles - 100 ");
		int opt=sc.nextInt();
		//int total_bill =0;
		switch(opt) {
		case 1:
			System.out.println("Selected item is pizza ");
			int pcost=200;
			System.out.println("Enter the Quantity : ");
			int pquantity = sc.nextInt();
			int pizzaprice = pquantity*pcost;
			System.out.println("Pizza bill : " + pizzaprice);
			total_bill += pizzaprice;
			break;
		case 2:
			System.out.println("Selected item is burger ");
			int bcost=120;
			System.out.println("Enter the Quantity : ");
			int quantity = sc.nextInt();
			int burgerprice = quantity*bcost;
			System.out.println("Burger bill : " + burgerprice);
			total_bill += burgerprice;
			break;
		case 3:
			System.out.println("Selected item is biryani ");
			int bicost=180;
			System.out.println("Enter the Quantity : ");
			int biquantity = sc.nextInt();
			int biryaniprice = biquantity*bicost;
			System.out.println("Biryani bill : " + biryaniprice);
			total_bill += biryaniprice;
			break;
		case 4:
			System.out.println("Selected item is noodles ");
			int ncost=120;
			System.out.println("Enter the Quantity : ");
			int nquantity = sc.nextInt();
			int noodlesprice = nquantity*ncost;
			System.out.println("Noodles bill : " + noodlesprice);
			total_bill += noodlesprice;
			break;
			default:System.out.println("selected item is not in our menu");
		
		}
		System.out.println("Do you want to continue (y/n) : ");
		yn=sc.next();
		} while(yn.equalsIgnoreCase("y"));
		System.out.println("Total bill is : " + total_bill);
		
		

	}

}
