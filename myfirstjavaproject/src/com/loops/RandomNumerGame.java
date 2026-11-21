package com.loops;

import java.util.Random;
import java.util.Scanner;

public class RandomNumerGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int randomnum = r.nextInt(100);
		boolean res=false;
		Scanner sc = new Scanner(System.in);
		String yn="";
		do {
		System.out.println("Lets start the game");
		for(int i=0;i<3;i++) {
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		if(num==randomnum) {
			//System.out.println("Congratulations you won the Game!!");
			res=true;
			break;
		}else if(num>randomnum) {
			System.out.println("Too High! Try Again");
		} else {
			System.out.println("Too Low! Try Again");
		}

	}
		if(res) {
			System.out.println("Congratulations you won the Game!!");
			System.out.println("The radom number is " + randomnum);
		} else {
			System.out.println("You  lost the  game");
			System.out.println("The radom number is " + randomnum);
		}
		System.out.println("Do you want to continue the game : (y/n) : ");
		yn=sc.next();
		}while(yn.equalsIgnoreCase("y"));
		System.out.println("visit next time soon!!");
	}

}
