package com.code3;

public class MyClass {
     void myMethod1() {
    	 System.out.println("Instance Method");
     
     }
     static void myMethod2() {
    	 System.out.println("Static Method");
     }
     
	public static void main(String[] args) {
		MyClass obj = new MyClass();
		obj.myMethod1();
		
		MyClass.myMethod2();
	}

}
