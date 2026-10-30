package com.languagefudametals;

public class DataTypesUsingWrapperClass {
	Integer std_id = 12;
	double std_id1 = (double) 12;
	String std_name = "Harika";
	Integer std_age = 22;
	Double std_marks = 95.55D;
	int std_marks1 = (int) 95.05D;
	Character std_grade = 'A';
	int std_grade1 = (int) 'A';
	char ch = 97;
	Boolean std_pass = true;
	//double val = 23.4555556767D;
	
	
	public static void main(String[] args) {
		DataTypesUsingWrapperClass obj = new DataTypesUsingWrapperClass();
		System.out.println("student id : " + obj.std_id);
		System.out.println("student id in double : " + obj.std_id1);
		System.out.println("student name : " + obj.std_name);
		System.out.println("student age : " + obj.std_age);
		System.out.println("student marks : " + obj.std_marks);
		System.out.println("student marks in integer type : " +obj.std_marks1);
		System.out.println("student grade : " + obj.std_grade);
		System.out.println("student grade in numbers : " + obj.std_grade1);
		System.out.println("student pass : " + obj.std_pass);
		System.out.println("character value : " + obj.ch);
		//System.out.printf("The decimal value would be after of specific length : %.2d",obj.val);
	}

}
