package com.day;



class Shape {
 public double getArea() {
     return 0.0;
 }
}

class Rectangle extends Shape {
  double width;
  double height;

 public Rectangle(double width, double height) {
     this.width = width;
     this.height = height;
 }

 public double getArea() {
     return width * height;
 }
}

public class shapes {
 public static void main(String[] args) {
     Rectangle myRectangle = new Rectangle(5.0, 7.0);
     
     double area = myRectangle.getArea();
     
     System.out.println("The area of the rectangle is: " + area); 
 }
}

