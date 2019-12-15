package com.class27;

public class Car {

	String make, model;

	Car() {
		System.out.println("I am a non argument constructor");
	}

	Car(String make, String model) {
		this.make = make;
		this.model = model;
	}
}

class Tesla extends Car {
	boolean autopilot;

	Tesla() {
		super();//  super();compiler will add by default to make a call to super class 
		//constructor to intilize and object
		System.out.println("I am a child not parent");
	}

	Tesla(String make, String modle, boolean autopilot) {
		super(make, modle);//  to call the constructor to intilaize
		this.autopilot = autopilot;
	}

	public void displayInfo() {
		System.out.println("Car " + make + " " + model + " has an autopilot " + autopilot);
	}
}
