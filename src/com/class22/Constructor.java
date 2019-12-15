package com.class22;

public class Constructor {
	 void Constructor(){
		System.out.println("Hello");
	}
	 Constructor(){// constructor CAN NOT have any return type NOT even void ,whilw method can have return
		 // Constructor MUST be same as name as a clasName,while method can have any name
		 //Constructor CAN NOT use any any  non access modifiers,while method can(Static,final,abstact)
		 //Constructor call happens AUTOMATICALLY  when object or instance of the class if getting created 
		 //while method MUST be called 
		 //Constructor initialize the object ,while method perform some specific functionalities,by using method
		 //we describe  behaviorof object 
		 // Similarties:
		 //both can have or do not have parameters
		 //both can use acces modifires 
		 System.out.println("I'm a constructor");
	 }
	 
public static void main(String[] args) {
	Constructor obj=new Constructor();
	obj.Constructor();
}
}
