package com.Class10;

public class ArraywithSwwitchCase {
	
	public static void main (String []args) {
		//Create an array of countries.
		//While retrieving all values from an array print capital for each country.	
	
String[] country = { "China", "Turkey", "USA", "CUBA", "CONGO" };
String[] capital = { "BeiJing", "ANKARA", "Washington Dc", "Havana", "KINSHASA" };	
for (int i = 0; i < country.length; i++) {	
switch(country[i] ){
	case "China":
		System.out.println("BeiJing");
break;
	case"Turkey":
		System.out.println("ANKARA");
		break;
	case"USA":
		System.out.println("Washington Dc");
		break;
	case "CUBA":
		System.out.println("Havana");
		break;
	case "CONGO":
		System.out.println("KINSHASA");
		break;

}


}



}	
	
	
	}


