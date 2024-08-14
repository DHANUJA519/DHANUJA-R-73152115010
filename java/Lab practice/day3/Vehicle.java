package com.day;
class Vehicles{
	void drive() {
		System.out.println("The vehicle is driven");
        		
	}
	
}
class car extends Vehicles{
	void drive() {
		System.out.println("Reparing a car.");
	}
}
  

public class Vehicle {

	public static void main(String[] args) {
		car vehicle = new car();
        vehicle.drive();
        
        
        
	}

}

