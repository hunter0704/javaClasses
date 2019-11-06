package com.class7;

public class WhileLoop {
	public static void main(String[] args) {
		int time = 10;
		while (time < 12) {
			System.out.println("Good Morning");
			time++;

		}
int x=50;
while(x>=20) {
	System.out.println(x);
	x--;
}
System.out.println("-----------------------------------------------------------------");
//print all even numbers from 1-20 
// 1st way increment value by 2
	int a=2;
	while(a<=20) {
		System.out.println(a);
		a+=2;
	
	}
	System.out.println("----------------------------------------------------------------");
	// 2nd way using modulus
	int q=2;
	while(q<=20) {
		if(q%2==0) {
			System.out.println(q);
		
		}
		q++;
	}
	System.out.println("***************************************************");
	//print only odd number 50-100
	int f = 100;
    while (f >= 1) {
        System.out.println(f);
        f -= 1;
	}

	}
	
	
	
}