package com.class6;

import java.util.Scanner;

public class SwitchAndScanner {
	public static void main(String[]args) {
		/*Ask user to enter theier gender F Or M
		 * based on the input provide 
		 * if F-->Female
		 * i M-->Male
		 * otherwise--uknowen
		 */
	
	Scanner input=new Scanner(System.in);
	System.out.println("Please enter your gender");
	char gender=input.next().charAt(0);
	
	String userGender;
	switch(gender) {
	case 'F':
		userGender="Female";
		break;
	case 'M':
		userGender="Male";
		break;
		default:
			userGender="UnKnown";
	}
	System.out.println("Your gender  is "+ userGender);
		
	
	}
	
	
	
	}
	
	


