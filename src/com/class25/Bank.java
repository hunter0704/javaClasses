package com.class25;

public class Bank {
	double money;
	public double  chargeFee() {
		double fee=0;
	   if(money<1000) {
		   fee=money*0.1;
		}else {
		fee=0;
	}
     return fee;
}
}
// optional to verify that you are actually overriding
// when we override same method exist with superclass and subClass
// In method overriding Method signature(name+Parameter)and retrun type MUST BE SAME

class PNC extends Bank{
	public double chargeFee() {
		double fee;
		if(money<1000) {
			fee=money*0.05;
		}else {
			fee=0;
				
			}
		return fee;
	}
	
		
	}
