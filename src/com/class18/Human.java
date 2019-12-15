package com.class18;

public class Human {
	// Instance variables
	String name;
	String lastName;
	// static variable
	static int eyes=2;
	static int nose=1;
	static boolean brain=true;
	public static void main(String[] args) {
		Human human1=new Human();
		human1.name="John";
		human1.lastName="Smith";
		System.out.println(Human.eyes);
		System.out.println(human1.nose);
		System.out.println(brain);
		System.out.println("*******************************************************************");
		
		Human human2=new Human();
		human2.name= "Jimmy";
		human2.lastName="Bahar";
		human2.name="Seda";
		
		System.out.println(human2.lastName);
		System.out.println(human2.lastName);
		
		
		
		
	}

}
