package com.class15;

public class StringManipulations {
public static void main(String[] args) {
	//string class comes with in java lang pacakage
	
	//2 way to create a string
	//1st way to create using string literal
	String str="hello";
	//scond way using new keyword creating a string object 
	String str1 = new String("");
	// inside String class we have many method that can performed on string
	
	//*find the number of charactor inside the string
	int length =str.length();
	System.out.println(length);
	
	// case conversion methods /functions
	str=str.toLowerCase().toUpperCase();//HELLO
	System.out.println(str);//HELLO
	
	//verify if there if the String is Empty
	String myString="";
	boolean isEmpty=myString.isEmpty();
	System.out.println(isEmpty);
	
	// when the value equals to null or no value at all
//	String myStrig1=null;
//	System.out.println(myStrig1.isEmpty());
	
	//How to verify existence of characters in the String (using contain)
	String a="Good evening student";
	boolean exist=a.contains("student");
	System.out.println(exist);
	// if we want to check the pecefect words we use starWith & endWith
	System.out.println(a.startsWith("Good"));
	System.out.println(a.endsWith("student"));
//get character at specific location
	String str2="Syntax Technologies Inc";
char letters=	str2.charAt(5);
System.out.println(letters);

System.out.println(str2.charAt(str2.length()-1));// To find the last character in the string

//get a substring from the String 
String substr1  =str2.substring(0,6);
System.out.println(substr1);
String substr2=str2.substring(7);
System.out.println(substr2);

//using Replace function
String str3="Java classes at Syntax are awsome";
str3=str3.replace("awsome", "great");
System.out.println(str3);
//find the spefic value and change to new value
str3=str3.replace("a","123458808%&");
System.out.println(str3);
// replace all ---> specify regular expression
//lets remove all special characters
str3=str3.replaceAll("[^A-Za-z0-9]", "");
System.out.println(str3);
//Split
String mysTring="Java classes at Syntax are awsome?";
String []array=mysTring.split("\\?");
System.out.println(array.length);






}
}
	
	
	
	
	
	
	
	
	




