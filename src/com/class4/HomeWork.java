package com.class4;

import java.util.Scanner;

public class HomeWork {
//Create a Java program that will ask if user has a credit card or not.
// If you user does not have a credit card then offer them. 
//If they do have one ask what is balance on the card? 
//If balance of the card is larger than 1000,
//tell them to pay off immediately, 
//otherwise you can tell them that they can spend more.	
		public static void main(String[]args) {
	Scanner input = new Scanner(System.in);
		System.out.println("Do you have a credit card? true or false");
		boolean creiditCard = input.nextBoolean();
		if (creiditCard) {
			System.out.println("Whats the balance on your card?");
			int balance = input.nextInt();
			if (balance > 1000) {
				System.out.println("Please pay off your bills");
			} else {
				System.out.println(" you can spend more money");
			}
		} else {
			System.out.println(" would you like to open credit card?");
		}

	}


}










