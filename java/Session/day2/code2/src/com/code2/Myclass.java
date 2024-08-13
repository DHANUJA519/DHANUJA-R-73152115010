package com.code2;
  
public class Myclass {
	int b = 20;
	static int c = 30;
	
	public static void main(String[]args) {
		int a = 10;
		System.out.println("Local Variable : " + a);
		
		Myclass obj = new Myclass();
		System.out.println(obj.b);
		
		System.out.println(Myclass.c);
	}

}
