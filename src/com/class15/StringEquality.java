package com.class15;

public class StringEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Hello";
String str1="Hello";
String str2=new String ("Hello");
String str3= new String("Hello");


System.out.println(str.equals(str1));
System.out.println(str.equals(str2));
System.out.println("**************************************************************");
System.out.println(str==str1);
System.out.println(str==str2);
	
	}

}
