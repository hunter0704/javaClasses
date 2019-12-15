package com.class22;

public class Constuctor {
	/*we want to build toyotacars 
	*that have diffrent models &colors */
	 public static   String make;
	public String model;
	public String color;
	public int speed;
	public int doors;
	Constuctor (String carModel, String carColor, int carSpeed, int carDoors){
		model=carModel;
		color=carColor;
		speed=carSpeed;
		doors=carDoors;
	}
	public void getDetail() {

		System.out.println("I build"+color+" " +make+" "+model);
	System.out.println("My car has"+doors+" can have speed up to" +speed);
	}
public static void main(String[] args) {
	
	make="BMW";
	//Compiler will give an error we have to 
	//pass values when we builld a
	//those values will be passed as argument to the  Constuctor
	//through  Constuctor instance variables will get initialiazed
	// Constuctor bCar1=new  Constuctor();
	 Constuctor bCar1=new  Constuctor("x5","Blue",400,2);
	bCar1.getDetail();
}
}
