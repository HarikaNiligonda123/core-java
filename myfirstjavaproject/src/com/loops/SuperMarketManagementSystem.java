package com.loops;

import java.util.Scanner;

public class SuperMarketManagementSystem {
	static int discount(int price,int discount) {
		int total = (discount/100)*price;
		return total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		System.out.println("Welcome to the Super Market!!");
		Scanner sc = new Scanner(System.in);
		String yn="";
		int total_price= 0;
		do {
		System.out.println("Enter the product");
		System.out.println("1. Rice \n 2. oil \n 3. Sugar \n 4. Milk");
		int choice = sc.nextInt();
		//int total_price= 0;
		switch(choice) {
		case 1 :{
			int rice_price = 300;
			System.out.println("Enter quantity : ");
			int n=sc.nextInt();
			int cur_riceprice = 0;
			for(int i=0;i<n;i++) {
				cur_riceprice += rice_price;
			}
			total_price += cur_riceprice;
			System.out.println("Rice :  " + cur_riceprice);
			break;
		}
		case 2 :{
			int oil_price = 200;
			System.out.println("Enter quantity : ");
			int n=sc.nextInt();
			int cur_oilprice = 0;
			for(int i=0;i<n;i++) {
				cur_oilprice += oil_price;
			}
			total_price += cur_oilprice;
			System.out.println("'oil :  " + cur_oilprice);
			break;
		}
		case 3 :{
			int sugar_price = 200;
			System.out.println("Enter quantity : ");
			int n=sc.nextInt();
			int cur_sugarprice = 0;
			for(int i=0;i<n;i++) {
				cur_sugarprice += sugar_price;
			}
			total_price += cur_sugarprice;
			System.out.println("Sugar :  " + cur_sugarprice);
			break;
		}
		case 4 :{
			int milk_price = 80;
			System.out.println("Enter quantity : ");
			int n=sc.nextInt();
			int cur_milkprice = 0;
			for(int i=0;i<n;i++) {
				cur_milkprice += milk_price;
			}
			total_price += cur_milkprice;
			System.out.println("'oil :  " + cur_milkprice);
			break;
		}
		default:System.out.println("The selected item is not in our list");
		}
		System.out.println("Do you want to continue : y/n : ");
		yn = sc.next();
		
		} while(yn.equalsIgnoreCase("y"));
		if(total_price>10000) {
			int dis_price = discount(total_price,15);
			total_price = total_price  - dis_price;
			System.out.println("Total price after discount : " + total_price);
		} else {
			System.out.println("Total price : " + total_price);
		}
		

	}

}
