package com.class15;

public class InterviewQuetion {

	public static void main(String[] args) {
		// Writea program to swap 2  numbers without a temporary vaiable ?
		
	int a=10;
	int b=20;
	a=a+b;//30
	b=a-b;//30-20=10
    a=a-b;//30-10=20
	System.out.println(" The value of the a="+a);
	System.out.println("The value of b=" +b);
	//Swap 2String without a temporary variable?
	String str1="Hello";
	String str2="Welcome";
	
	str1=str1+str2;//HelloWelcome-->12
	str2=str1.substring(0,str1.length()-str2.length());//Hello
	str1.substring(str2.length());
	System.out.println("The value of str1=" +str1);
	System.out.println("The value of str2=" +str2);
	
	}

}
