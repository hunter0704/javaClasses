package com.class5;

public class LogicalAnd {

public static void main(String[]args) {
	/* if number is between 1-10--->this number is small
	 * if number is between 10-100--->this number is medium
	 * if number is between 100-->this number is large
	 * any other number -->is out of range
	 */
	int num=20;
	if(num>1 && num<10) {
		System.out.println("this number is small");
	}else if (num>=10 && num<100) {
		System.out.println("This number is medium");
	}else if(num>=100 && num<1000) {
	System.out.println(" this number is large");
	}else {
		System.out.println(" the  number is out of range");
	}
	
	
	
	
	
}





}
