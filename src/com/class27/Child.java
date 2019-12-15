package com.class27;

public class Child extends Parent {
	String name="James";
	public static void main(String[] args) {
		
		Child obj=new Child();
		obj.callName();
		
	}
public void callName() {
	System.out.println(name);// child class will print 
	System.out.println(super.name);// parentclass will print
	//super.variableName--> refers to the parent class
	//variable (if parent class and child class have same variable name and you w
	System.out.println(lastName);
}
public void callingMethod() {
	callName();// by default this is added- so we are calling current class method
    super.callName();
    // Interview quetion whats the differnt super and super.
}
}
