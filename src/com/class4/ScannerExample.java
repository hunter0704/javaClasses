package com.class4;

import java.util.Scanner;

public class ScannerExample {

public static void main(String[]args) {
	
Scanner scan=new Scanner(System.in);
System.out.println(" Please enter any number");
int num=scan.nextInt();
System.out.println( "You Enter " +num);
System.out.println(" Please enter your name");	
String name=scan.next();
	System.out.println(" Good Afternon "+name);
}
}
