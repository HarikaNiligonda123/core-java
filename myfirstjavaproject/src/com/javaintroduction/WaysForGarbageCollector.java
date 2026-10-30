package com.javaintroduction;

public class WaysForGarbageCollector {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object is destroyed!!");
	}
	

	public static void main(String[] args) {
		WaysForGarbageCollector obj1= new WaysForGarbageCollector();
		WaysForGarbageCollector obj2= new WaysForGarbageCollector();
		WaysForGarbageCollector obj3= new WaysForGarbageCollector();
		System.out.println(obj1);  // @27716f4 
		System.out.println(obj2);  //@8efb846
		System.out.println(obj3);  //@2a84aee7
		 obj1=null;   //nullifying the object, it is one way to tell the garbage collector about unused objects
		 obj2=obj3;    //re-assigning the object, in these case re assigning
		 System.gc();
		 System.out.println(obj1);
		 System.out.println(obj2);
		 System.out.println(obj3);

	}

}
