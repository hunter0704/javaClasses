
package com.class24;

public class AnimalTest {
	public static void main(String[] args) {
		Animal animal=new Monkey();
		animal.whoAmI();
		//  when overriden static method it will be method hidden  
		// we wont have a accese to the child class 
	}

}
