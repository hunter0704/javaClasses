package com.class15;

import java.util.Scanner;

public class ClassTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan =new Scanner(System.in);
System.out.println("Please enter the browser name");
String browser=scan.nextLine();
	
switch(browser.toLowerCase())	{
case "firefox":
	System.out.println("Execution be performed " +browser);
	break;

case "Chrome":
	System.out.println("Execution be performed " +browser);
break;

case "ie":
	System.out.println("Execution be performed " +browser);	
break;
default:
	System.out.println("Please enter the vaild browser");

}
	
	
	
	
	
	
	}

}
