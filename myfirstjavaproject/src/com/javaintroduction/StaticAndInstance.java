package com.javaintroduction;

public class StaticAndInstance {
	 static StaticAndInstance a=new StaticAndInstance();    // calling methods in instance blocks without calling in main method ,
	{
		static1();
		System.out.println(static2());
		static3();
		instance1();
		instance2();
	}
	static {   // calling static methods and instance methods in static block, we can directly call the static methods in static block but to instance method in static block will require an object reference to call and the object must be static 
		static1();
		System.out.println(static2());
		static3();
		a.instance1();
		a.instance2();
	}
	static void static1() {
		System.out.println("Static1 is completed");
	}
	static String static2() {
		return "Static2 is completed";
	}
	static void static3() {
		System.out.println("Static3 is completed");
	}
	void instance1() {
		System.out.println("Instance1 is completed");
	}
	void instance2() {
		
		System.out.println("Instance2 is completed");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StaticAndInstance obj = new StaticAndInstance();
//		obj.instance1();
//		obj.instance2();

	}
	
}
