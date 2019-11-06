package com.class4;

import java.util.Scanner;

public class ScannerClassRep {
public static void main (String[]args) {
	//Write  a program that takes user's first name and surname.
	//First input: "Please Enter First Name" should print first input.
	//Second input:"Please Enter Surname" should print second input.

	//Scanner input=new Scanner(System.in) ;
//	System.out.println("Please Enter First Name");
//	String firstInput=input.next();
//	System.out.println("Please Enter Surname");
//	String SecondInput=input.next();
//	System.out.println(firstInput+" "+SecondInput);
	     	
	//Write a program that asks the user's age.
	 //Then display it by adding 10 (i.e age + 10) in your final output.     
	     
//	     Scanner input =new Scanner(System.in);
//	     int age=input.nextInt();
//	     System.out.println("Your age after 10 years is "+(age+10));
//	     
	//Write a program to take user name, age and mobile number in single line.
	//Scanner input =new Scanner(System.in);
	//First Output: "Enter your name"
	//System.out.println("Enter your name");
	//String name=input.next();
	//Second Output: "Enter your mobile number"
	//System.out.println("Enter your mobile number");
	//String mobileNumber=input.next();
	//Third Output: "Enter your age"
	//System.out.println("Enter your age");
//	int age=input.nextInt();
	//Final Output: "Your name is ___ , your age is ___ and your mobile number is (___)-___-____"    // 
	// System.out.println("Your name is "+name +","+" your age is "+age+" " +"and your mobile number is"+mobileNumber) ; 
	    
	
	
	 // Create a program that will take a boolean value from a user. 
    Scanner userInput=new Scanner(System.in);
    System.out.println("Input the boolean value");
    boolean value=userInput.nextBoolean();
	//If the input is True or False, then the output should look like below: 
if (value) {
	System.out.println("The value is "+value);

}else {
	System.out.println("false");
}
}
      
 }
	
	
	
	
	
