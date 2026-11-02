package com.javaintroduction;

public class ObjectCount {
	static int count=0;
	 {
		count++;
		//System.out.println(count);
	}
	public static void main(String[] args) {
		ObjectCount obj1 = new ObjectCount();
		ObjectCount obj2 = new ObjectCount();
		ObjectCount obj3 = new ObjectCount();
		System.out.println(count);
		// TODO Auto-generated method stub

	}

}
