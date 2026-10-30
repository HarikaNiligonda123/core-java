package com.languagefudametals;
import java.util.Scanner;


public class Accout {
	static int balance=1000;
	static int deposit(int balance,int amount_to_deposit) {
		balance = balance+amount_to_deposit;
		return balance;
	}
	 static int withdrawn(int balance,int amount_to_withdrawn) {
		balance = balance-amount_to_withdrawn;
		return balance;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount to deposit: ");
		int amount_to_deposit=sc.nextInt();
		System.out.println("Enter amount to withdrawn: ");
		int amount_to_withdrawn=sc.nextInt();
		System.out.println("Balance after deposit: " + deposit(balance,amount_to_deposit));
		System.out.println("Balance after withdrawn: " +withdrawn(balance,amount_to_withdrawn));
		
		
	}

}
