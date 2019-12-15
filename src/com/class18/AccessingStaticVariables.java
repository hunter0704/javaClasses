package com.class18;

public class AccessingStaticVariables {

	public static void main(String[] args) {
		StaticAndInstanceVariable obj=new StaticAndInstanceVariable();
		System.out.println(obj.name);
		obj.name="zoe";
		System.out.println(obj.name);
		
		System.out.println(StaticAndInstanceVariable.breed);
		StaticAndInstanceVariable.breed="New breed";
		System.out.println(obj.breed);
	}

}
