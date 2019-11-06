package com.class5;

import java.util.Scanner;

public class Class5Task {
	public static void main(String[] args) {
//ask user to enter the month they were born 
//based on the month define the season
// if user is born in jan,feb,dec-->winter 
// if user id born in march,april ,may --> spring
//if jun ,july,august--> Summer
//if sep,oct ,nov-->fall
// otherwise -- unkowen 
// print " you were born in"
		Scanner input = new Scanner(System.in);
		System.out.println(" Plese enter the month you were born");
		String month;
		String season;
		month = input.next();
		if (month.equals("jan") || month.equals("feb") || month.equals("dec")) {
			season = "Winter";
		} else if (month.equals("march") || month.equals("april") || month.equals("may ")) {
			season = "spring";

		} else if (month.contentEquals("jun") || month.equals("july") || month.equals("august")) {
			season = "Summer";

		} else if (month.contentEquals(" sep") || month.equals("oct") || month.equals("nov")) {
			season = "fall";

		} else {
			season = "unkowen";
		}

		System.out.println("you were born in " + season);

	}

}
