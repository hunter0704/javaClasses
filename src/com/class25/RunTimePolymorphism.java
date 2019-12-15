package com.class25;

public class RunTimePolymorphism {

	public static void main(String[] args) {
	//creating an object on parent class
		Animal animal=new Animal();
		animal.sleep();
		animal.eat();
		System.out.println("************************************************************");
		
		// creating an object of child class
		Cat cat =new Cat();
		cat.eat();
		cat.sleep();// from child
		cat.Meow();// from child 
		//widening
		double d=90;
		//narrowing
		int i=(int)1.99;
		System.out.println("***************************************************************************");
	// Type of casting in java
	//1) Implicit/Widening/Automatically
	//2)Explicit/Narrowing/Manually
// -primitives-->byte

Animal obj	=new Cat();//-->  none primitive upcasting
//widening--> creating an object of the parent class
//and giving reference to the Parent class
// narrowing 
// Cat obj2=new Animal();-->Can not convert from animal to cat
	obj.eat();//coming from parent 
	obj.sleep();// this method will come from child class-->RunTime Polymorphism
	// obj.Meow(); compiler error --> method wont availbele
	
	}

}
