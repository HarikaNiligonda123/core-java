package com.Oops;
class Vehicles{
	int speed =50;
	
	void display() {
		System.out.println("speed is : " + speed);
	}
	
}
class Car1 extends Vehicles{
	int s=100;

	void display() {
		System.out.println("Speed of Car is : " + s);
	}
	
	
}

public class VehicleCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicles c = new Car1();
		c.display();
		

	}

}
