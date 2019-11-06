package com.class11;

public class ArrayEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Create an array of cars and store 6 elements into it.
//Using 2 different loops print all values from the array.
	//1st way	for each loop
		String[] cars = { "Toyota", "Tesla", "Jeep", "Honda","Scion" ,"Nisan"};

		for (String car : cars) {
			System.out.println(car);

		}
//2nd way for loop and array 
		for (int i=0;i<cars.length;i++) {
			System.out.println(cars[i]);
		}
		
	
//Create an array on integers and calculate the sum of all elements in an array.
// 1st way For loop
int []number= {10,20,30};
int sum=0;
for (int a=0;a<number.length;a++) {
	sum=sum+number[a];
System.out.println(sum);
}

		
//Create an array of countries. While retrieving all values from an array print capital for each country. (use 2 different loops).
	
	String []country= {"China","Turkey","USA"};
	String [] capital= {"Beijing","Ankar","Washington"};
	for (String x:country) {
		switch(x) {
		case"China":
			System.out.println(capital[0]);
			break;
		case "Turkey":
			System.out.println(capital[1]);
		break;
		case"USA":
			System.out.println(capital[2]);
			

		}
	}
	
	
	}

}


