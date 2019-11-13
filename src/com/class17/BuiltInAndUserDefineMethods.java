package com.class17;

import java.util.Scanner;

public class BuiltInAndUserDefineMethods {
	public static void main(String[] args) {
		
		// Methods:
		// built in methods- limited and we can not modify 
	
		String str="Hello";
		str=str.replace("Hello", "Hi");
		System.out.println(str);
		
		Scanner scan= new Scanner(System.in);
		String scannerString=scan.nextLine();
		System.out.println(scannerString);
		BuiltInAndUserDefineMethods obj=new BuiltInAndUserDefineMethods();
		obj.myMethood();
		
	}
		 void myMethood () {
			 System.out.println(" This is user defined method that i created");
			 
		 }
		
		
	}


