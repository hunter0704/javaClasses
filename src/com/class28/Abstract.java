package com.class28;
//Abstraction --> is a proccess of hiding implementation details and showing the functionality
//In java  Abstractction can be achieved in 2 ways-->1).Abstract Class. 2)Interfaces
// Abstract Class is a class defined with abstract Keyword and it has implemente and unimplementd
// two type of class -->1)Abstract Class.2) Concrete class
//abstract -->is non acces modifire 
//abstract is-->is a keyword that identifies sothing in incomplete'
// Undefined/unimplemnent /abstract methods -->methods without body
abstract class Dog{
	String breed;
	public void bark() {
		System.out.println("Bark!!");
	}
}
class Chihuahua extends Dog{
	
}
public class Abstract {
	public static void main(String[] args) {
	Chihuahua c=new Chihuahua();
	c.bark();
	
	}

}
