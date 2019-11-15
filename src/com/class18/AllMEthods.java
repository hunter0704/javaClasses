package com.class18;

public class AllMEthods {
	// create methods to return value of sum
	//create methods to return value of sub
	//create methods to return value of mult
	//create methods to return value of div
	
	int sum (int num1, int num2) {
		int result= num1+num2;
		return result;
		
	}
int sub(int num1,int num2) {
	int  sub=num1-num2;
	return sub;
}
int div (int num1,int num2) {
	int  div= num1/num2;
	return div;
}

int mult(int num1,int num2) {
	int mult=num1*num2;
	return mult;
}
int findLargest(int num1,int num2) {
	int largest;
	if  (num1>num2) {
		largest=num1;
	}
	else {
		largest=num2;
	}
	return largest;
}
// method to return wheather number  is odd
boolean isOdd(int num) {
	boolean isOdd;
	if (num%2!=0) {
		isOdd=true;
	}else {
		isOdd=false;
	}
	return isOdd;
	}
}



