package com.class5;

import java.util.Scanner;

public class MoreLogialExample {
public static void main (String[]args) {
//ask user to enter daily sales
//based on the sales range we want to give commission to the person
//if sale is <100--commission is 10%
//if sales between 100-200-->commission of 20%
	double salesAmount;
	double	commission;
	Scanner scan=new Scanner(System.in);
	System.out.println("enter daily sales");
	 salesAmount=scan.nextDouble();
	if(salesAmount<100) {
		commission=salesAmount*0.1;
	
	}else if(salesAmount>=100 && salesAmount<200) {
			commission=salesAmount*0.2;
	}else if (salesAmount>=200 && salesAmount<500) {
			commission=salesAmount*0.3;
	}else  if (salesAmount>=500) {
			commission=salesAmount*0.5;
	}else {
			commission=0;
	}
	System.out.println("Based on the sales your commision is "+commission);
}
}
