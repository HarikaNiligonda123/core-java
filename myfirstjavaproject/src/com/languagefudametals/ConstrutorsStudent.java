package com.languagefudametals;

public class ConstrutorsStudent {
	static int count;
  ConstrutorsStudent() {
	  System.out.println("No Arg constructor called!!");
	  count++;
  }
  ConstrutorsStudent(int count) {
	  System.out.println("Parameterised constructor is called!!");
	 this.count++;
  }
	public static void main(String[] args) {
		ConstrutorsStudent obj1 =new ConstrutorsStudent();
		ConstrutorsStudent obj2 =new ConstrutorsStudent(count);
		ConstrutorsStudent obj3 =new ConstrutorsStudent(count);
		
		System.out.println("count : " + count);
		
		
		
		// TODO Auto-generated method stub

	}

}
