package com.class15;

public class InterviewQuetion5 {

	public static void main(String[] args) {

		//Reverse a string word b word?
		
		String given ="Welcome to the Java class ";
		// to reverse String 
		//split();
		//step one: spilt -->array of string
		//step two: use for loop and use decrement to print value
String reversed="";
		String []str =given.split("\\s");
for (int i=str.length-1;i>=0;i--) {
	reversed =reversed+str[i]+ " ";
}
System.out.println(reversed);	
// write a java program to reverse String ?
// step one:use charArray();
char[] charArray=given.toCharArray();
for (int j=charArray.length-1;j>=0;j--) {
	System.out.println(charArray[j]);
}
// we can also do using by charAt();
for (int x=given.length()-1; x>=0;x--) {
	System.out.print(given.charAt(x));
}



	}	
}
