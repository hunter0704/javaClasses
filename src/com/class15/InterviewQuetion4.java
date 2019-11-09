package com.class15;

public class InterviewQuetion4 {
public static void main (String[]args) {
// How to find out the part of the string from a string?
// what is the substring?
// Find number of words in string ?
	String str ="Today is very cold outside";
	String subString=str.substring(0,5);
	System.out.println(subString);
	// step one: split based on the space --> array of string
	// step two:  find the length of an array
	System.out.println(str);
	String[]words=str.split(" ");
	System.out.println(words.length);
	
	
	
	
	
	
}
}
