package com.class5;

import java.util.Scanner;

public class Class5Task1 {
	public static void main(String[] args) {
		// ask user to enter boolean value for sale
		// if no sale ---> "i'm not shopping
		// if sale --> check the price of the items
		// based on the amount we will have to calculate the price after discount
		// if price <20-->apply 10%
		// if the price between 20-100-->20%
		// if between 100-500-->>30%
		// anything-->50%

		// print after discount---the price of the item reduce from--to --
		Scanner input = new Scanner(System.in);
		System.out.println("Is there a sale going on? True or False");
		boolean sales = input.nextBoolean();

		double price;
		double discount;
		double finalPrice;

		if (!sales) {
			System.out.println("i'm not shopping");
		} else {

			System.out.println(" What is the acuall price ?");
			price = input.nextDouble();

			if (price < 20 && price < 10) {
				discount = price * 0.10;

			} else if (price > 20 && price > 100) {
				discount = price * 0.20;
			} else if (price < 100 && price > 500) {
				discount = price * 0.30;
			} else {
				discount = price * 0.50;
			}
			finalPrice = price - discount;

			System.out.println(
					"after discount " + discount + " the  price of the item reduce from " + price + " to " + finalPrice);

		}
	}

}
		
	
	
	


