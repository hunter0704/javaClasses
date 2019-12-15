package com.class29;

public interface Drivable {
	// Interface is collection of public static final variables
	boolean DRIVE_FAST = true;// constant variabless are written using UPPER case

	// by default compiler will add public abstract
	// Interface -a coloction of public static final variables and public abstract
	// methods
	void drive();
}

class Cars {
	public void stop() {
		System.out.println(" Car stops by pressing breaks");
	}
}

class Toyota extends Cars implements Drivable {

	@Override
	public void drive() {
		System.out.println(" Toyota can drive");

	}
}