package com.Arrays;

public class ReverseInternalElements {
	static int[] split1(int[] arr) {
		int[] res = new int[arr.length];
		int idx=0;
		
		for(int i=0;i<arr.length;i++) {
			int temp = arr[i];
			int num=0;
			while(temp!=0) {
				int rem=temp%10;
				num = num*10+rem;
				temp = temp/10;
			}
			res[idx++]=num;
		}
		return res;
	}
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {11,21,13,14,15,16};
		for(int i=0;i<arr.length;i++) {
			String res = String.valueOf(arr[i]);
			for(int j=res.length()-1;j>=0;j--) {
				System.out.print(res.charAt(j));
			}
			System.out.print(" ");
		}
		System.out.println();
		int[] res = split1(arr);
		
			for(int num:res) {
				System.out.print(num+" ");
			}
		
	}

}
