package com.code4;

public class Myclass {
	String name;
	Myclass(String name){
		this(10, 20);
		this.name = name;
		this.greeting();
	}
	Myclass(int a, int b){
		System.out.println("Addition : " + (a + b));
	}
	void greeting() {
		System.out.println("Welcome" + name);
	}
	public static void main(String[]args) {
		Myclass obj = new Myclass("Dhanu");
	}
	}


