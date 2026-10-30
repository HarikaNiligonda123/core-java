package com.languagefudametals;
class Vehicle {
	String type;
	Vehicle(String type) {
		this.type=type;
		}
}
class Car extends Vehicle {
	String Brand;
	int price;
	Car(String type,String Brand,int price) {
		super(type);
		this.Brand=Brand;
		this.price=price;
	}
	
}
class ElectricCar extends Car{
	int batteryCapacity;
	ElectricCar(String type, String Brand,int price,int batteryCapacity) {
		super(type,Brand,price);
		this.batteryCapacity=batteryCapacity;
	}
	void display() {
		System.out.println("Type : " + type);
		System.out.println("Brand : " + Brand);
		System.out.println("price :  " + price);
		System.out.println("battery capacity : " + batteryCapacity);
		
	}
}
 
public class VehicleConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String type = "Car";
		String Brand="BMW";
		int price=800000;
		int batteryCapacity=240;
		ElectricCar obj=new ElectricCar(type,Brand,price,batteryCapacity);
		obj.display();
		
		
		
		
	}

}
