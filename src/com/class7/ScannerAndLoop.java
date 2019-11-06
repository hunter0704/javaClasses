package com.class7;

import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {
		//Ask User to enter name 
		//and our output  should be " Good afternoon---"
		Scanner input=new Scanner(System.in);
		int i=1;
		while(i<=5) {
		System.out.println(" Please enter your name ");
		String name=input.next();
		System.out.println("Good afternoon "+name);
        i++;
	
	
		}
	
	}

}
