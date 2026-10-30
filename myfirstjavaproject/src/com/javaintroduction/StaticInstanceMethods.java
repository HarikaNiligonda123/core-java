package com.javaintroduction;

public class StaticInstanceMethods {
	static void m1() {
			System.out.println("method1 is called");
		}
	static void m2() {
		m1();
		System.out.println("method2 is called");
	}
	void m3() {
		System.out.println("method3iscalled");
		m2();
	}
	

	public static void main(String[] args) {
		StaticInstanceMethods s=new StaticInstanceMethods();
		s.m3();
		// TODO Auto-generated method stub
		

	}

}
