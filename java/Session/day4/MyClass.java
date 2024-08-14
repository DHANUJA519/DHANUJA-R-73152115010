package com.day4;
class Animal {
	int a = 10;
	void move() {
		System.out.println("All animals move from one place to another place");
	}
	void eat() {
		System.out.println("All animals will eat something");
	}
}
class Dog extends Animal {
	int a = 10;
	void move() {
		System.out.println("Dog will walk");
	}
	void eat() {
		System.out.println("Dog will eat chicken");
	}
}

public class MyClass {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.move();
		dog.eat();
		
		//Dynamic method dispatch
		Animal animal;
		animal = new Dog();//DMD
		animal.move();
		animal.eat();
		System.out.println(animal.a);
		
		
	}

}
