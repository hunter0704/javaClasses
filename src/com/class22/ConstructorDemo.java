package com.class22;

public class ConstructorDemo {
	//How can we create a Constructor?
	//1st Constructor should have same name as our class
	//2nd Constructor can not have retrun type not even void 
	
	//How Constructor is execute?
	// Everytime when we create an object we call 
	//it constructor and entire block of code inside the Constructor will executed first
	
	// If we didnt create any Constructor -->Compiler will create one default constructor
	
	ConstructorDemo (){
		System.out.println(" I'm your consturctor");
	
	}
	ConstructorDemo(String str){
		System.out.println("I'm constructor with 1 parameter "+str);
	}
	ConstructorDemo(int num){
	System.out.println("I'm constructor with 1 parameter "+num);
	}
	ConstructorDemo(int num,int num1){
		System.out.println("I'm constructor with 2 parameter "+num);
		}
	public static void main(String[] args) {
		ConstructorDemo obj= new ConstructorDemo();
		System.out.println("code after creating an object");
    obj.hello();
    obj.hello("Hello");
    ConstructorDemo obj1= new ConstructorDemo(200,456);
	}
public void hello() {
	System.out.println("Hello Class");
	System.out.println("Hello Instructors");
}
public void hello(String str) {
	System.out.println("Hello Class1");
	System.out.println("Hello Instructors1");
	
}

}

