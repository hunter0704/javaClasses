package com.class4;

import java.util.Scanner;

public class ScannerTask {
public static void main(String[]args) {
//You are a loan specialist and you need to ask user what is the amount of loan is needed. 
//If loan is less than 200,000 then you would lend the money 
//otherwise you would reject the client.
	Scanner input=new Scanner(System.in);
	System.out.println("what is the amount of loan is needed");
	int loan= input.nextInt();
	if (loan<200000) {
		System.out.println("You got approved");
		}else {
			System.out.println("  You got Reject");
		}
	
	
	
	
	
//You are DMV representative and you need to ask customer their age.
// If they are 18 and older you will issue a driver licence to them, 
//otherwise you will offer them to get a learners permit.
	Scanner age=new Scanner(System.in);
	System.out.println(" Enter your age ?");
	int num=age.nextInt();
	if (num>18) {
		System.out.println(" You will get Driver Licence");
	
	}else {
		System.out.println("learners permit ");
	}
	
	
	
	
	
	
	
//Create a Java program that will ask user to input temperature and city. 
//Your program should convert Fahrenheit into celsius 
//and print “The temperature is the city __ is __”	
	Scanner text=new Scanner(System.in);
	System.out.println(" please enter  the temperature  ");
	int temperature =text.nextInt();
	temperature = (temperature - 32)*5/9;
	System.out.println(" Plase enter the city");
	String city=text.next();
	System.out.println(" The temperature is the city "+city+" is "+ temperature);
}
	
     
     
 

}
	

