package com.Class9;

public class PaternTask2NestedLoop {
	public static void main(String[] args) {
/*
 * *
 * **
 * ***
 * ****
 * *****
 * 
 * 
 */
		for (int i = 1; i <= 5; i++) {
			for (int a = 1; a <= i; a++) {
				System.out.print("*");
			}
			System.out.println();
		}
			for(int b=1;b<5;b++) {
				for(int c=4;c>=b;c--) {
					System.out.print("*");
					
			}
			System.out.println();
			
					}
		
	}
		}

