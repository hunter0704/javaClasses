package com.class3;

public class IfElseRecap {
	public static void main(String[] args) {
		/*
		 * Class schedule if tuesday-->SDLC if wendsday-->Java review if thursday-->SDLC
		 * if saturday-->Java Coding if Sunday--> My favoiryte Java coding
		 * 
		 */
		int day = 6;
		if (day == 2) {
			System.out.println(" SDLC Class");
		} else if (day == 3) {
			System.out.println(" Java review");
		}

		else if (day == 4) {
			System.out.println(" SDLC");
		} else if (day == 6) {
			System.out.println(" Java Coding");
		} else if (day == 7) {
			System.out.println(" My  faviorite Java coding");
		} else {

			System.out.println(" There is no class ");
		}

	}
}
