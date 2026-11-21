package com.Oops;

 class Vehicle1 {  //parent
	 String Vehiclename(String name) {
		return name;
	}
	int speed(int s) {
		System.out.println("speed of the vehicle: ");
		return s;
	}
	void start() {
		System.out.println("The vehicle is started");
	}
	void stop() {
		System.out.println("The vehicle is stopped");
	}
 }
 
 
 class Car extends Vehicle1{
	 void sunroof() {
	 	System.out.println("car sunroof is opened ");
	 }
 }
	 class Bike extends Vehicle1  {
	 	void dowheelie() {
	 		System.out.println("Bike dowheelie");
	 	}
	 }
	 class Truck extends Vehicle1 {
	 	void loadCargo() {
	 		System.out.println("The cargo is loaded in truck");
	 	}
	 }
	 
 public class Vehicle {
	 public static void main(String[] args) {
		 Car c = new Car();
		 System.out.println("Car details");
		 System.out.println(c.Vehiclename("Car"));
		 System.out.println(c.speed(100));
		 c.start();
		 c.stop();
		 c.sunroof();
		 Bike b =new Bike();
		 System.out.println("Bike details");
		 System.out.println(b.Vehiclename("Bike"));
		 System.out.println(b.speed(90));
		 b.start();
		 b.stop();
		 b.dowheelie();
		 Truck t = new Truck();
		 System.out.println("Truck details");
		 System.out.println(t.Vehiclename("Truck"));
		 System.out.println(t.speed(90));
		 t.start();
		 t.stop();
		 t.loadCargo();
		 
		 
		 
		 
		 
	 }
 }


