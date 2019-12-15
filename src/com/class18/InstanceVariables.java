package com.class18;

public class InstanceVariables {
String name="Samir";
	public static void main(String[] args) {
		String name ="Burcu";
		System.out.println(name);
		
		InstanceVariables obj =new InstanceVariables();
		System.out.println(obj.name);
		// changing value og the instance variblle
		obj.name="John";
		System.out.println(obj.name);
		
		InstanceVariables obj1=new InstanceVariables();
		System.out.println(obj1.name);
	

	}

}
