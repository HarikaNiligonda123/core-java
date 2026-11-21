package com.loops;
import java.util.Scanner;
public class RoundingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int n=sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			int temp = arr[i]%10;
			if(temp < 5) {
				arr[i]=arr[i]-temp;
			} else if(temp>5) {
				int val = 10-temp;
				arr[i]=arr[i]+val;
			} else {
				arr[i]=arr[i];
			}
		}
		for(int num:arr) {
			System.out.print(num +" ");
		}
	}

}
