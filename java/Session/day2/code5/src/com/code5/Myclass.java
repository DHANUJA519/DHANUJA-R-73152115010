package com.code5;

public class Myclass {
	void myMethod(String name) {
		System.out.println("Welcome" + name);
	}
	void myMethod(int a, int b) {
		System.out.println("Sum : " + (a + b));
	}
	void myMethod(int n) {
		System.out.println("Sum : " + (n + n));
	}
	public static void main(String[]args) {
		Myclass obj = new Myclass();
		obj.myMethod(5);
		obj.myMethod("Dhanu");
		obj.myMethod(10, 20);
	}

}
