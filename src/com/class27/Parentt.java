package com.class27;

public class Parentt {
	// super-->to refer to immediate parent variables ,methods,constructors 
	// 
	String str ="Hello";
	int age;
	public Parentt (int age) {
		this.age=age;
	}


 public void hello () {
	 System.out.println("Hello");
 }
}
class Child extends Parentt{
	Child (int age){
	super(age);
	}
	String str1="Bye";
	public void access() {
		System.out.println(str);
		System.out.println(super.str);
	}
	public void hello() {
		System.out.println("hello");
		
	}
public void display() {
	hello();
	super.hello();
}
}