package com.class22;

public class ConstructrCountry {
	
	// Types of consturctor :1).None -Argument constructor 
	//2).Parameterized Constructor
	// We as programers can define our own constructor with parameters
	
	public String capital,name;
	public int population;
	ConstructrCountry (){
		System.out.println(" I'm none argument constructor");
	}
	
	public ConstructrCountry( String countryName,String CountryCapital, int countryPopulation) {
		this.name=countryName;
		this .capital=CountryCapital;
		this.population=countryPopulation;
		
	}

	public void displayInfo() {
		System.out.println(name+" "+capital);
		}
	public static void main(String[] args) {
		 ConstructrCountry country1=new  ConstructrCountry("USA","Washington dc",350000000);
         ConstructrCountry country2=new  ConstructrCountry("Kazakhstan","Astana",180000000);
         ConstructrCountry country3=new ConstructrCountry ();
         
         country1.displayInfo();
         country2.displayInfo();
         country3.displayInfo();
	}
	

}
