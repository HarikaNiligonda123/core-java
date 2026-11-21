package com.Oops;
class Device {
	private String brand;
	private int price;
	void setBrand(String b) {
		this.brand=b;
		}
	String getBrand() {
		return brand;
	}
	void setprice(int p) {
		this.price=p;
	}
	int getprice() {
		return price;
	}
	void displayDetails() {
		System.out.println("Brand : " + brand);
		System.out.println("Price : " + price);
		
	}
	
}
class Laptop extends Device {
	int ram;
	int processor;
	void runIDE() {
		System.out.println("runIDE is called");
	}
	void compilecode() {
		System.out.println("The code is compiled");
	}
	void displayDetails() {
		System.out.println("Brand : " + getBrand());
		System.out.println("Price : " + getprice());
		compilecode();
		runIDE();
		System.out.println("Ram of a Laptop : " + ram);
		System.out.println("Processor of a laptop : " + processor);
	}
	
}

class Mobile extends Device {
	int camera;
	int battery;
	void makecall() {
		System.out.println("call is connected");
	} 
	void takephoto() {
		System.out.println("photo is captured");
	}
	void displayDetails() {
		System.out.println("Brand : " + getBrand());
		System.out.println("Price : " + getprice());
		makecall();
		takephoto();
		System.out.println("Ram of a Laptop : " + camera);
		System.out.println("Processor of a laptop : " + battery);
	}
	
	
}
public class Vcube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop l=new Laptop();
		l.setBrand("Dell");
		l.setprice(60000);
		l.ram=500;
		l.processor=3;
		l.displayDetails();
		Mobile m=new Mobile();
		m.setBrand("Oppo");
		m.setprice(20000);
		m.camera=48;
		m.battery=4000;
		m.displayDetails();
		

	}

}
