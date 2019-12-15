package com.class29;

public class DrivableTest {

	public static void main(String[] args) {
		Drivable obj = new Toyota();
		obj.drive();
		// Drivable.Drive_FAST=false;-->Compiler Error final valur cannot be reassigned
		//clas to clas we use EXTENDS 
		//class to interface we use IMPELMENT

		Toyota toyota = new Toyota();
		toyota.drive();
		toyota.stop();

	}

}
