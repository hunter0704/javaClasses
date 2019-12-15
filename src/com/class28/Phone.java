package com.class28;

public abstract class Phone {

	// implemented method
	public void makeCall() {
		System.out.println(" Make call");
	}

	public void sendText() {
		System.out.println(" Send Text");
	}

// unimplemented methods
	public abstract void takePicture();

	public abstract void playGame();

}
//Concrete Class
class Iphone extends Phone {

	@Override
	public void takePicture() {
		System.out.println("iphone takes picture");

	}

	@Override
	public void playGame() {
		System.out.println(" play games on the iphone");

	}

}

class Samsung extends Phone {

	@Override
	public void takePicture() {
		System.out.println("Samsung takes picture");

	}

	@Override
	public void playGame() {
		System.out.println(" play games on the Samsung");

	}
}