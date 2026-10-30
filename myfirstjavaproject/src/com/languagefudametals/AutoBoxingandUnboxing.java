package com.languagefudametals;

public class AutoBoxingandUnboxing {
	Integer stu_id = 101;
	Integer stu_marks = 100;
	Boolean PassStatus = true;
	public static void main(String[] args) {
		AutoBoxingandUnboxing obj=new AutoBoxingandUnboxing();
		int primstu_id = obj.stu_id;// wrapper to primitive Autoboxing;
		Integer wrapperstu_id = primstu_id;
		int primstu_marks = obj.stu_marks;
		Integer wrapperstu_marks = primstu_marks;
		
		System.out.println("Student id  primitive : " + primstu_id);// TODO Auto-generated method stub
		System.out.println("Student id wrapper : " + wrapperstu_id);
		System.out.println("Student marks primitive : " + primstu_marks);
		System.out.println("Student id wrapper : " + wrapperstu_marks);
		System.out.println("Student marks status : " + obj.PassStatus);

	}

}
