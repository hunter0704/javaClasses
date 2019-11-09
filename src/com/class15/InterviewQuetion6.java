package com.class15;

public class InterviewQuetion6 {

	public static void main(String[] args) {
// Write a Java Program to find whether a String is palindrome or not?
// if the reversed string and  oorginal string are same for  example-->string is palindrome
// logic :
// step one: reversed the string 
//step Two: compare 2 strings:
//if stringd are equal--> palindrome
//else -->not palindrome

	
		String orginal="kayak";
		String reversed="";
		//5-1=4-1
		for (int i=orginal.length()-1; i>=0;i--) {
			
		reversed=reversed+orginal.charAt(i);//"" +K=k+a	=ka+k
		}
	
System.out.println(reversed);
if (orginal.equals(reversed)){
	System.out.println("string is palindrome");
}else {
	System.out.println("String is not palindrome");
	
}
	
	}

}
