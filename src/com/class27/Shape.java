package com.class27;

public class Shape {
// Shape class has a constructor that takes the radius and has a subclass 
//as  circle class. In circle class create 
//a method to calculate the area of circle. Test your code
double radius;
Shape(double radius){
	this.radius=radius;
}
}
class circle extends Shape{
	circle(double radius){
		super(radius);
	}
public void circleArea() {
	System.out.println();
}
}
