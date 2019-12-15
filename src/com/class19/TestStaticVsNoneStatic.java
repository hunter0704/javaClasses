package com.class19;

public class TestStaticVsNoneStatic {
	public static void main(String[] args) {
		
	
	//how to access static members
	// they can be accesed by className

	System.out.println(StaticVsNoneStatic.school);
	StaticVsNoneStatic.getInfo1();
	
	// how to access non static members 
	//theycan be accessed by creating
	// an object of that class
	StaticVsNoneStatic obj=new StaticVsNoneStatic();
	obj.name="John";
	obj.grade='A';
	obj.getInfo1();
	// obj.getInfo1();possible, not perferable
	
	}

}
