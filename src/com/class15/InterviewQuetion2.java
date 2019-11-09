package com.class15;

import java.util.Arrays;

public class InterviewQuetion2 {
public static void main(String[] args) {
// Write a java program to find the largest number in the array?
	//Maximum and minimum number in the array	
	int []array= {100,-90,8787,898,0,1};
	// 1st easiest way
	Arrays.sort(array);
	int min =array[0];
	int max =array[array.length-1];
	
	System.out.println(min);
	System.out.println(max);
// 2nd way 
	int []myArray= {100,-90,8787,89845,0,1,-90,8787};
	int largest=myArray[0];
	int smallest=myArray[0];
	
	for (int i=0;i<myArray.length;i++) {
		if (myArray[i]>largest) {
			largest=myArray[i];
		}if (myArray[i]<smallest) {
			smallest=myArray[i];
		}
	}
System.out.println(" The smallest value in the array is "+smallest);
System.out.println(" The largest value in the array is " +largest);

int []num= {100,-90,8787,898,898,0,1,-90,878};
int large=num[0];
int secondLarge=num[0];
for (int i=0;i<num.length;i++) {
	if (num[i]>large) {
		secondLarge=large;
		large=num[i];
	}
	else  if (num[i]>secondLarge && num[i]<large) {
		 secondLarge=num[i];
	 }
}
System.out.println("The second largest value in the array" +secondLarge);

}
}
