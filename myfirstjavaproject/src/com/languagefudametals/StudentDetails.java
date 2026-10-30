package com.languagefudametals;
import java.util.*;
public class StudentDetails {
	//static StudentDetails obj=new StudentDetails();
	void Student_Details(int roll_no,String name,String course) {
		System.out.println("roll_no : "+ roll_no);
		System.out.println("name : "+ name);
		System.out.println("course : "+ course);
		
	}
	int calculate_marks(int mathsmarks,int sciencemarks,int socialmarks) {
		int totalres = mathsmarks+sciencemarks+socialmarks;
		return totalres;
	}
	float avgmarks(int mathsmarks,int sciencemarks,int socialmarks) {
		int res =calculate_marks(mathsmarks,sciencemarks,socialmarks);
		return res/3;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetails obj=new StudentDetails();
		Scanner sc = new Scanner(System.in);
		int roll_no=sc.nextInt();
		String name=sc.next();
		String course =sc.next();
		int mathsmarks=sc.nextInt();
		int sciencemarks=sc.nextInt();
		int socialmarks=sc.nextInt();
		obj.Student_Details(roll_no, name, course);
		System.out.println(obj.calculate_marks(mathsmarks, sciencemarks, socialmarks));
		System.out.println(obj.avgmarks(mathsmarks, sciencemarks, socialmarks));

	}

}
