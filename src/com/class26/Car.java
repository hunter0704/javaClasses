package com.class26;

public class Car {
	String make,model;
	int year;
	Car(){
		System.out.println(" I'm non argurment constructor");
	}
public void display() {
	System.out.println(" we build " + year +""+make+""+model);
	
}
public static void main(String[] args) {
	Car car=new Car();
	car.display();
	car.notify();
	// int num-->Compile error variables must be intialize
	//System.out.println(num);
	Tesla tesla= new Tesla();
	
}
}
class Tesla extends Car{
	boolean autoPilot;
	Tesla(){
		System.out.println("Non argurment constructor of the chilld class");
	}
}