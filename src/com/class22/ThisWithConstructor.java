package com.class22;

public class ThisWithConstructor {
	
	// this keyword always is used to refer or acess current class of instance member
	// this keyword can be used with varaisble 
	//this can be used with method-->to call current class instance method
	// this()
	ThisWithConstructor(){
		System.out.println(" I'm non argument constructor");
		
	}

	ThisWithConstructor(String str){
		this();// used to call curent class constructor
		System.out.println(" I'm constructor with one parameter");
	}
	ThisWithConstructor(String str,String str1){
		this ("Hello");// this () always MUST be a first statement
		// in this case it is second statement - > so we got compiler error
		System.out.println("I'm a constructor with 2 parameter");
	}
public static void main(String[] args) {
	
	ThisWithConstructor obj=new ThisWithConstructor("Hello");
	// Can we execute 2 constructor  when we creating an object ?
	// yes -it can be achieved using this ();
	//This type of constructor calls is known as CONTRUCTOR CHAINING
	ThisWithConstructor obj1=new ThisWithConstructor("Hello","bye");
}


}



