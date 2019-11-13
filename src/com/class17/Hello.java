package com.class17;

public class Hello {
	void sayHello(String name) {
		System.out.println(" Hello " +name);
	}
public static void main(String[] args) {
// 
Hello obj = new Hello();
obj.sayHello("Asel");
obj.sayHello("Alex");
obj.sayHello("Diego");
obj.sayHelloDiffrentLanguage("USA");
obj.sayHelloDiffrentLanguage("China");
obj.sayHelloDiffrentLanguage("Russia");	
obj.sayNameAndage("Seda", 18);
obj.isSnowing(false);
obj.isSnowing(true);
}
// create a method that will say hello in diffrent laguage 
//based on the value that will be passed when user callsa methods

void sayHelloDiffrentLanguage(String country) {
	
	switch (country.toLowerCase()) {
	
	case"usa":
		System.out.println("Hello");
	break;
	case"china":
		System.out.println("Ni hao");
		break;
	case"russia":
		System.out.println("Privet");
		break;
	
	}
	
	
	
}

//method to say and age
void sayNameAndage( String name,int age) {
	System.out.println("My name is " +name+" I am "+age+" years old");
}
// create the method that will check if it snowing
// if snow -->Stay at home , otherwise go for a walk
void isSnowing(boolean isSnowing) {//method header
	//method body
	if(isSnowing) {
		System.out.println("Stay At Home");
	}
	else {
		System.out.println("Go For Walk");
	}
}

}
