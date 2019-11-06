package com.class5;

public class Compare2NumbersUsingNotOperator {
public static void main (String[]args) {
// compare 2 numbers not using  Not operator	
int num1=10;
int num2=11;
if (num1==num2) {
	System.out.println("Numbers are equal");
}else {
	System.out.println("Numbers are not equal");
}
	if (!(num1==num2)) {
		System.out.println("Numbers are Not equal");
	}else {
		System.out.println("Numbers are equal");
	}
// if name is not Marry or Anana than you are not my sister
	String name="Marry";
	String name2="Anna";
	if(!(name.equals("Marry")|| name2.contentEquals("Anna"))){	
		System.out.println(" you are not my sister");
	}else {
		System.out.println("You are my sister");
	}
	
	
	
	
}
}
