package com.javaintroduction;

public class Student {
	
	static int batchno; //intialising the static data we use the keyword static
	static String batchname;
	
	int rollno; // initialising the instance data don't have any specific keyword
	String name;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(Student.batchno);  // output is 0 because static data directly use the default value for int is '0', for string types it takes the null automatically as default value
//		System.out.println(Student.batchname); //output is null (default value)
		
//		System.out.println(s.rollno); //for accessing the instance values we need to use object reference.
//		System.out.println(s.name);  
		
		batchno=79;   // Assigning the static data
		batchname="vcube79";
		System.out.println(batchno);
		System.out.println(batchname);
		Student s=new Student();
		s.rollno=8305; //Assigning the instance data in order to assign the instance data we cannot assign directly but we can access indirectly using the object reference
		s.name="Harika";
		System.out.println(s.rollno);
		System.out.println(s.name);
		
	}

}
