package com.Class10;

public class ArrayWithForLooptask {
	public static void main (String []args) {
//Create an array of countries.
//While retrieving all values from an array print capital for each country.	
		String[] country = { "China", "Turkey", "USA", "CUBA", "CONGO" };
		String[] capital = { "BeiJing", "ANKARA", "Washington Dc", "Havana", "KINSHASA" };
		for (int i = 0; i < country.length; i++) {
			if (country[i].equals("China")) {
				System.out.println("BeiJing");
			} else if (country[i].equals("Turkey")) {
				System.out.println("ANKARA");
			} else if (country[i].equals("USA")) {
				System.out.println("Washington Dc");
			} else if (country[i].equals("CUBA")) {
				System.out.println("Havana");
			} else if (country[i].equals("CONGO")) {
				System.out.println("KINSHASA");
			}
		}

	}

}


