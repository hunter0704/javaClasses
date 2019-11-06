package com.class4;

import java.util.Scanner;

public class ScannerClass {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println(" please enter your name:");
	String name=sc.next();
	System.out.println("my name is " +name);
	
	System.out.println("Please enter your age: ");

	int age=sc.nextInt();
	System.out.println("I'm  years old " +age);
	
}




}
