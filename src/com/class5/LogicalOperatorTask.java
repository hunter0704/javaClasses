package com.class5;

import java.util.Scanner;

public class LogicalOperatorTask {
	public static void main(String[] args) {
//Write a program that will print whether it is a weekend or weekday. 
//If any day from 1-5 → output “It is a weekday”,
//any day from 6-7 → output “It is a weekend”, 
//any other day → output “Invalid day”	
		int days = 3;
		if (days == 1 || days == 5) {
			System.out.println("It is a weekday");
		} else if (days == 6 || days == 7) {
			System.out.println("It is a weekend");

		} else {
			System.out.println("Invalid day");
		}

	
//	Prompt the user to enter person heights in inches.
//Person should be classified as one of the following:
		//short (under 5 feet)
		//medium(5 to 6 feet)
		//tall (6 feet and over)
Scanner input=new Scanner(System.in);
System.out.println("Please enter your heights:");
float heights=input.nextFloat();
if (heights<5 ) {
	System.out.println("Short");
}else if (heights>=5||heights<6) {
	System.out.println("medium");
}else if (heights==6 || heights>6) {
	System.out.println("Tall");
}else {
	System.out.println("invaild");
}
}
}