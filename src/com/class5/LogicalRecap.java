package com.class5;

public class LogicalRecap {
	public static void main(String[] args) {
		// declare the time (1-24)
		// based on the time identify whether if its morning ,afternoon,evening,night
		// if time 1-11 --> morning
		// if time 12-15-->Afternoon
		// if time 16 -20 -->evening
		// if time >20 -->night

		int time = 20;
		String timeOfDay;
		if (time >= 1 && time <= 11) {
			timeOfDay = "Morning";
		} else if (time >= 12 && time <= 15) {
			timeOfDay = "Afternoon";
		} else if (time >= 16 && time <= 20) {
			timeOfDay = "evening";

		} else if (time > 20 && time<=24) {
			timeOfDay = "Night";

		} else {
			timeOfDay = "Invalid";
		}
      System.out.println("Time of the day is "+ timeOfDay);

	}
}
		
		
		
		
		
		
		
		
