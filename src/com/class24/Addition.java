package com.class24;

public class Addition {
	//Method Overloading same methods in same class
		//
		//two ways
		//1 by passing different number of parameters
		//2 by passing diffrent datatype parameter
	// Polymorphism
	//2 types of Polymorphism:-->Compile time Polymorphism/staic Binding/ early binding-method overloading
	//Method overloading is having same method name within SAME class by having different number
	//of parrameters of diffrent type of parameters
	// Run time Polymorphism/dynamic binding/late binding method overriding
	// Method oerriding
	public void add(int num1, int num2)
	{
	System.out.println(num1+num2);	
	}
	public void add(int num1,int num2,int num3)
	{
		System.out.println(num1+num2+num3);
	}
	public void add(double num1, double num2)
	{
		System.out.println(num1+num2);
	}
	public void add(int num1,double num2)
	{
		System.out.println(num1+num2);
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Addition obj=new Addition();
	obj.add(4, 6);
	obj.add(4, 7, 8);
	obj.add(12.4,10.2);
	obj.add(10,12.4);
	String str="Hello";
	System.out.println(str.substring(2));
	System.out.println(str.substring(0, 3));
		}
	}
