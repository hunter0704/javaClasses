package com.Class9;

import java.util.Scanner;

public class PaternnNastedForLoopTask4 {
	public static void main (String[]args) {
		
// write a guessing game where the user has to guess a secret number 
//Between 1 and 20 after every guess input, 
// the program tells the user whether their number was too large||too small
//The program will keep asking the user to enter the correct number 
// when the correct answer is found the system should display" Congratulations!!You got it
		
		Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number ");
        int guessNumber=16;

    for (int i=0; i<=20; i++) {
    	int input=scan.nextInt(); 
            
            if (input>guessNumber) {
                System.out.println("Your number is too large. Enter again");
            }else if (input<guessNumber) {
                System.out.println("your number is too small. Enter again");
            } else {
            	System.out.println("Congratulations!!You got it");
            }
}
	}
}