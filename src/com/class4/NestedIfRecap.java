package com.class4;

public class NestedIfRecap {
	public static void main(String[] args) {
		boolean isDisplyed = true;
		String buttonText = "Sigh In";
		if (isDisplyed) {
			System.out.println("button is displyed");
			if (buttonText.equals("Sighn In")) {
				System.out.println("Test Case is pass ");
			} else {
				System.out.println("Wrong text is displyed");
			}
		} else {
			System.out.println(" Button is not displyed");

		}
	}

}
