package com.class16;

public class ClassObjectMethodContinnue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ClassObjectMethods car1=new ClassObjectMethods();
car1.make="Tesla";
car1.modle="S3";
car1.color="Black";
car1.year=2020;
car1.wheels=4;
car1.windows=5;
car1.speed=200;	
// accessing beaivor for car1
car1.start();
car1.accelerate();
car1.drive();

System.out.println("*******************************");
ClassObjectMethods car2=new ClassObjectMethods();	
car2.make="BMW";
car2.modle="i8";
car2.color="Purpule";
car2.year=2019;
car2.wheels=4;
car2.windows=6;
car2.speed=300;

car1.start();
car1.accelerate();
car1.drive();
	}

}
