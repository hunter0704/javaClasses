package com.Class9;

import java.util.Scanner;

public class PaternNestedForLoopTask3 {
	
	public static void main (String[]args) {
//write a program that read a range of integers(start and end point)
// provided by a user and then from that range print the sum of the even and integer 
		int startNum;
		int endNum;
			
Scanner input =new Scanner (System.in);		
System.out.println("Please Enter Start number  ");
startNum=input.nextInt();
System.out.println(" please Enter End Number");
 endNum =input.nextInt();	
	
 if (startNum<=endNum);
 
    int sumOfEven = 0;
    int sumOfEnd = 0;
    for (int i = startNum; i <= endNum; i++) {
if (i % 2 == 0) {
	sumOfEven =sumOfEven+ i;
	} else {
		sumOfEnd = sumOfEnd+i;
		}
}
   
   
	 
    System.out.println(" sum of the even " + sumOfEven);
    	System.out.println(" sum of the odd " + sumOfEnd);
    	
	}else {
		System.out.println(" please enter star number less than end number");
			
		}
		
	}
	

		
		
		
		
		
		
		
		
	


