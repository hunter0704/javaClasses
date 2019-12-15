package com.class22;

public class ConstuctorTest {

	public static void main(String[] args) {
		// Constuctor -->ClassName
		//car1 ORcar2-->Object referne variable
		//=-->Assigning operator
		//new-->Key word used to create an object
		// Constuctor ()--> is  Constuctor 
		//;--> End of statement 
		// Constuctor -is special method/block of code
		//that being executed when we create an object
		//or an Instance
		// Constructor can Intilize instance variable
		//Constructor can Intilize an object
		Car .make="Toyota";
		 Car car1=new Car();
		 car1.model="Camry";
		 car1.color="Pink";
		 car1.speed=200;
		 car1.doors=4;
		 car1.getDetail();
		 System.out.println("**************************************");
		 Constuctor.make="Toyota";
		 
//		 Constuctor car2=new  Constuctor ();
//		 car2.model="Corolla";
//		 car2.color="Pink";
//		 car2.speed=150;
//		 car2.doors=2;
//		 car2.getDetail();
//		 
	 Car car3=new  Car ();
//		 car3.model="Prius";
//		 car3.color="Green";
//		 car3.getDetail();
		 
		 Constuctor betterCar1=new Constuctor ("Corola "," White", 180 , 5);
		 betterCar1.getDetail();
	}

}
