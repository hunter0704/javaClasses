package com.class22;

public class ClassTask {
// write a program that will have a 4 diffrent accesse modifire constructor class create3 objects of this class1
//inside the same class
//class2 -from the outside the class and observe result
//result 3 from diffrent class inside diffrent package 
 
	public ClassTask (){
		System.out.println(" I'm public consturctor");
	
	}
	  ClassTask(String str){
		System.out.println("I'm default  constructor ");
	}
	 private ClassTask(int num){
	System.out.println("I'm  private constructor ");
	}
	 protected ClassTask(int num1,int num2 ) {
		System.out.println("I'm  protected constructor ");
	 }
	 public static void main(String[] args) {
		 ClassTask obj1=new ClassTask();
		 ClassTask obj2=new ClassTask();
		 ClassTask obj3=new ClassTask("Some String");
		
		 
		
	}
	 }