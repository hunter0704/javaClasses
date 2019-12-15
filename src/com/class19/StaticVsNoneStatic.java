package com.class19;

public class StaticVsNoneStatic {
	// template for a student(School, name , grade)
	
	static String school="Syntax";
	String name;
	char grade;
	//instance method
	void grtInfo() {
		System.out.println(" My name is "+ name +"and i'm going to "
				+school+ " and my grade is "+grade );
		
	}
//static method
	static void getInfo1() {
		System.out.println(" I'm attending at" +school);
		//System.out.println("My name is "+name);
		// complier will give an error
		//you van not acceess NoN static members within STATIC method
	}
public static void main(String[] args) {
	
	// accessing static member within same class
	// we just use the name for a variable
	//or we call method by its name only
	System.out.println(school);
	getInfo1();
	
}
}
