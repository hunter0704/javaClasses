package com.class5;

import java.util.Scanner;

public class LogicalAndScanner {
public static void main (String []arg) {
//ask user to enter age
	//if age is from 1-3--->you are a baby
	// if age 3-5--> you are a toddler
	//if age 5-12-->you are a kid 
	//if age 12-19-->teenger
	// if age>20 ---> you are an adult
	Scanner input=new Scanner(System.in);
	System.out.println(" Enter your age");
	String human;
	int age=input.nextInt();
	if ( age>=1 && age<=3) {
		//System.out.println("you are a baby");
	human="baby";
	}else if (age>3 && age<=5) {
		//System.out.println("you are a toddler");
		human="toddler";
	}else if (age>5 && age <=12) {
		//System.out.println("you are a kid");
		human="Kid";
	}else if (age>12 && age<=19) {
		//System.out.println("teenger");
	human="teener";
	}else if (age>19) {
		//System.out.println("you are an adult");
	human="adult";
	}else {
		//System.out.println(" invaild");
	human="invaild";
	}
	
	
	
	
}
}
