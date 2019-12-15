package com.class24_1;

public class ConstructorOverRiding {
	//diffrent amount of parameters
	ConstructorOverRiding(){
		System.out.println("I'm non -argument consturotor");
		
	}
	ConstructorOverRiding(String str){
		System.out.println(" I''m constructor with 1 String parameter");
	}
// having diffrent type of parameters
	ConstructorOverRiding(int num){
		System.out.println(" I'm constructor with 1 int parameter ");
	}
		}
