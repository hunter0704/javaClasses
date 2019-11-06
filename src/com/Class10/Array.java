package com.Class10;

public class Array {
	public static void main (String[]args) {
		int a;
		a=10;
		int[]b;//declare an array--->pefer way
		int c[];// we can write like this as well
		
		b=new int [4];// initialize an array
		
		//2 nd way ---> all in 1 line (declaration & initialization)
		int []array =new int [4];
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		// access value from an array 
		System.out.println(array[2]);
		
		// lets create an array that  will store classes
		String []classes=new String[4];
		classes[0]="Java";
		classes[1]="SDLC";
		classes[2]="Manual Testing";
		classes[3]="GIT";
		//Today we have a java classes
		System.out.println(" Today we have " +classes[0]+"Classes");
		
		System.out.println("------------------------------------------------------------");
		
		int []nums=new int[3];
		nums[0]=1;
		nums[1]=2;
		nums[2]=3;
		
		//how can change 1 to 100
		nums[0]=100;
		System.out.println(nums[0]);
System.out.println("**********************************************************");		
// we are putting less elements inside the array
// we get compiler will give default value
// default value of boolean is false
// default value of String = null
// default value of int =0
//default value of double =0.0
// we can not store othe type inside array 
// imt[] array=new int [3]-->we must store only integers
// if we try to store values of other type--> compiler will give an error " can nnot convert.
// The size of an array is FIXED
//
		
		
		
	}

}
