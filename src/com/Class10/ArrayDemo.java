package com.Class10;

public class ArrayDemo {
public static void main (String[]args) {
	int[]nums=new int[5];
	nums[0]=12;
	nums[1]=13;
	nums[2]=14;
	nums[3]=15;
	// To find number of elements we simply use .lenth(property of array)
	System.out.println(nums.length);
	
	// another way to create array
	String[]arary= {"winter ","Summer " ,"Fall ","Spring "};
	System.out.println("I was born in "+ arary[2]);
	// array.length will return an integer 
	int arraySize=arary.length;
	System.out.println(arraySize);
	
	
	
}

}
