package com.code5;
//constructor overloading

public class Myclass1 {
       Myclass1(String name) {
		System.out.println("Welcome" + name);
	}
	   Myclass1(int a, int b) {
		System.out.println("Sum : " + (a + b));
	}
	    Myclass1(int n) {
		System.out.println("Sum : " + (n + n));
	}
	public static void main(String[]args) {
		Myclass1 obj1 = new Myclass1("Dhanu");
		Myclass1 obj2 = new Myclass1(10, 20);
		Myclass1 obj3 = new Myclass1(5);
		
	}

}
