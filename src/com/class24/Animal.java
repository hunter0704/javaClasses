package com.class24;

public class Animal {
	// Method Overrifing Rolls
	//1) Inheritance is Must
	//2) method signuture (name & parameters) and return type MUST BE SAME
	//3) Access modifires CANNOT be reduced but can be INCREASED
	//4) Static metthod CANNOT BE OVERRIDEN, they are hidden
	//5)Connstructors CANNOT be Overriden
	//Private method CANNNOT be overriden
	// Final is keyword identifies that no firther 
	//modfication Can  be made to cla
	//
	Animal(){
		System.out.println("Animal constructor");
	}
	public static void whoAmI() {
		System.out.println("I'm an animal");
		
	}

}
class Monkey extends Animal{
	// can't override static methods with instance methods
	//public void whoAmI(){
	
//}
	Monkey(){
		System.out.println("I'm child class costructor");
	}
	public  static void whoAmI() {
		System.out.println("I'm a Monkey");
	}
}