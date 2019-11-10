package com.class16;

public class ClassAndObjectCarContinue {

	public static void main(String[] args) {
	// to create an object syntax is 
	// ClassName variable =new className;
	
ClassAndObjectCar car1=new ClassAndObjectCar();
	car1.make="Tesla";
	car1.model="S3";
	car1.color="Black";
	car1.year=2020;
	car1.wheels=4;
	car1.windows=5;
	car1.speed=200;
	
	ClassAndObjectCar car2=new ClassAndObjectCar();
	car2.make="BMW";
	car2.model="i8";
	car2.color="Purpule";
	car2.year=2019;
	car2.wheels=4;
	car2.windows=6;
	car2.speed=300;
	
	
	System.out.println("I have"+car1.color+car1.make);
	System.out.println("I Drive " +car2.make+car2.year);
	}

}
