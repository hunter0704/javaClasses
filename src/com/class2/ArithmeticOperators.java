package com.class2;

public class ArithmeticOperators {
public static void main (String []args) {
	
	//declare  2 variable and initialize them 
	//perform addition ,subtracttion,multiplication and divistion
	int num1,num2;
	num1=20;
	num2=10;
//	System.out.println(num1+","+num2);
//	System.out.println(num1-num2);
//	System.out.println(num1*num2);
//	System.out.println(num1/num2);
//	System.out.println(num1+num2);
	
	int sum =num1+num2;
	int sub=num1-num2;
	int mult=num1*num2;
	int divi=num1/num2;
	String text="The addition of 2 numbers is ";
    String text1="The subtraction 2 numbers is ";
    String text2= "The multiplication of 2 numbers is ";
    String text3 ="The divistion of 2 numbers is ";
	System.out.println(text +" "+sum);
	System.out.println(text1+" "+sub);
	System.out.println( text2+ "" +mult);
	System.out.println(text3+ ""+divi);
	
}
}
