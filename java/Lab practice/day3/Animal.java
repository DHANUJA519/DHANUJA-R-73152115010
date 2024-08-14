package com.day;
class Animals{
	void makesound() {
		System.out.println("The animal makes a sound.");
        		
	}
	
}
class Cat extends Animals{
	void makesounds() {
		System.out.println("The Dog bark.");
	}
}
  

public class Animal {

	public static void main(String[] args) {
		Cat animal = new Cat();
        animal.makesounds();
        
       
        
	}

}
