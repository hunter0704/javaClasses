package com.class28;

public class PhoneTest {

	public static void main(String[] args) {
		// you CAN NOT create an object of an abstract class
		//Phone phone =new Phone(); -->Compiler error, can not instanciate
		//we can create it indirectly
		
		Phone phone=new Iphone();
		phone.makeCall();
		phone.sendText();
		phone.takePicture();
		phone.playGame();
		

	}

}
