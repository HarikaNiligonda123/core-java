package com.javaintroduction;
import java.util.Scanner;
public class StudentDetails {
	static {
		System.out.println("College name");
	}
	static StudentDetails st = new StudentDetails();
	{
		System.out.println("Student Object is created");
	}
		static void collegeDetails() {
			System.out.println("SRITW College");
		}
		void Student(int rollNo,String name,int marks) {
			System.out.println("Student Details***");
			System.out.println("Rollno : " + rollNo);
			System.out.println("Name : " + name);
			System.out.println("Marks : " + marks);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int rollNo=sc.nextInt();
		String name=sc.next();
		int marks=sc.nextInt();
		collegeDetails();
		st.Student(rollNo, name, marks);
		st.Student(2, "Anupriya", 90);
		

	}

}
