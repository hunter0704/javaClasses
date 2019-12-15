package com.class28;

public class Main {

	class child extends Parent
	{
	  void name()
	{
	  System.out.println("Child method");
	}
	}

	class Parent
	{
	  int adding(int num,int num2)
	  {
	    int result=num+num2;
	    return result;
	  }
	}
	class Child extends Parent
	{
	   int adding(int num,int num2)
	  {
	   int result=num+num2;
	   System.out.println(result);
	    return result;
	  }
	}
}
		
