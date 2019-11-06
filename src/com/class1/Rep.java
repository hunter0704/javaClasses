package com.class1;

public class Rep {
public static void main(String[]args) {

//boolean isTrue=true;
//boolean isFalse=false;
//System.out.println(isTrue);
//System.out.println(isFalse);


	   int num1 = 5;
	    int num2 = 4;
	    int num3 = 3;
	    
	    int num4 = 7; 
	    int num5 = 10;
	    int num6 = 5;
	    
	    //start coding here
	    int result1 ;
	    int result2 ;
	// Add the values of num1 and num2 and then subtract num3 from the result and store it in result1
	 int add=num1+num2;
	  result1=add-num3;
	 
	//Multiply num4 and num5 together and then divide num6 from the result and store it in result2
	int multi=num4*num5;
	result2 =multi/num6;
	int modd=result2%result1;
	//Print following statement:
	  System.out .println (result2+"modded by "+result1 +"is " + modd);




}
}