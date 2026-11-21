package com.Oops;

//import java.util.Scanner;

class Employee {
	private int eid;
	private String ename;
	private int esal;
	private String password;
	public void seteid(int eid) {
		this.eid=eid;
	}
	public int getid() {
		return eid;
	}
	public void setname(String ename) {
		this.ename=ename;
	}
	public String getname() {
		return ename;
	}
	public void setsal(int esal) {
		this.esal=esal;
	}
	public int getsal() {
		return esal;
	}
	public void setpassword(String password) {
		this.password=password;
	}
	public String getpassword() {
		return password;
	}
}

public class EmployeeEcapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		Employee emp=new Employee();
		emp.seteid(1);
		emp.setname("Harika");
		emp.setsal(100000);
		emp.setpassword("@@@@@@@");
		System.out.println("Employee details : ");
		System.out.println("id: " + emp.getid());
		System.out.println("name: " + emp.getname());
		System.out.println("sal: " + emp.getsal());
		System.out.println("password: " + emp.getpassword());

	}

}
