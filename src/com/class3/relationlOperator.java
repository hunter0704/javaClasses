package com.class3;

public class relationlOperator {

	public static void main(String[] args) {
		int num1 = 20;
		int num2 = 19;
		System.out.println(num1 > num2);
		System.out.println(num1 < num2);
		double d = 1.99;
		double d1 = 2.99;
		boolean b = d > d1;
		System.out.println(b);
		boolean b1 = d < d1;
		boolean b2 = d == d1;
		boolean b3 = d1 != d;
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);

//if number a is bigger than number b
//i want to print s is larger than 
		int a = 200;
		int bb = 60;
		if (a > bb) {
			System.out.println("a is larger than ");

		} else {
			System.out.println("a is smaller  than bb ");
		}

		int expectedHours = 15;
		int actualHours = 20;
//if expected Hours are more than acual --> you will succeed
//else --> please study more
		if (actualHours > expectedHours) {
			System.out.println(" you will succeed");
		} else {
			System.out.println("study more ");
		}

double teaPrice=4.99;
double allowedPrice=3.99;
//if the price more than i can afford i will Not buy
//if the price is less or matches what i can afford then i will buy tea

if (allowedPrice>=teaPrice) {
	System.out.println(" I will buy tea");
	System.out.println(" And i will enjoy tea");
}
else {
	System.out.println("i can afford then i will buy tea");
System.out.println(" I will go back to study");
}
System.out.println(" i keep writing code");		
		
	}
}


