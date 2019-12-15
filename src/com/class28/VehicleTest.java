package com.class28;

public class VehicleTest {
	//Abstarct Class:
//Iplemented and unimplemented methods 
	//implemented -static & Non static 
	// unimplemented =abstract =no body
	//abstract methods --> NO STATIC,NO FINAL,NO PRIVATE CONSTRUCTOR
	//
	// 

	public static void main(String[] args) {
	BMW bmw=new BMW("767jbh676","Sedan","BMW","X5");
	BMW.displayTotal();
	Vehicle.displayTotal();
	//come from Vehicle class
	bmw.breaking();
	bmw.drive();
	bmw.speed();
	bmw.start();
	// comes from Car class
	bmw.breaking();
	//comes from BMW
     bmw.display();
	
     
     Car car=new BMW("JHNRKDFJRU","Suv","BMW","X3");
     // comes from Vehicle class
     car.drive();
     car.stop();
     car.speed();
	
	
	Vehicle vehicle= new BMW("7YIHNUI","Truck","BMW","A7");
	//come from Vehicle class
	vehicle.drive();
	vehicle.stop();
	vehicle.speed();
	vehicle.start();
// comes from Car class -- wont be avaible to the parent
//vehicle.breaking();
//comes from BMW- wont be available to the grandparent 
//vehicle .display();
	
	 new BMW("87996","Truck","BMW","A7");
	 new BMW("yiu8789989yiy","Sedan","BMW","i3");
	 new BMW("yiu89787yiy","Sedan","BMW","i7");
	 System.out.println("______________________________________");
	BMW.displayTotal();
	
	
	
	}

}
