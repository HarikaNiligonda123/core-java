package com.Oops;
class Student {
	String name;
	int id;
	Address address;
	public Student(String name, int id, Address city) {
		super();
		this.name = name;
		this.id = id;
		this.address = city;
	}
	
}
 class Address {
	String city;
	public Address(String city) {
		super();
		this.city = city;
	}
	
}

public class ShallowCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Address a = new Address("Hyderabad");
		//a.Address.city="Hyderabad";
		Student s1 = new Student("Harika",101,new Address("Hyderabad"));
		Student s2 = new Student(s1.name,s1.id,s1.address);
		s2.address.city="Bangolre";
		System.out.println(s2.name);
		System.out.println(s2.id);
		System.out.println(s2.address.city);
		
		
	}

}
