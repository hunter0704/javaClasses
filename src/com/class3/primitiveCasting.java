package com.class3;

public class primitiveCasting {

	public static void main(String[] args) {
   //widening or automatic or implicit casting 
		// byte-->short-->int-->long-->float-->double
		byte b=127;
		int i=b;
		 int num=123;
		 double d1=num;
		 System.out.println(d1);
		 // narrowing or explicit or manual casting 
		 //double-->foat-->long-->int-->short-->byte
		 double d2=123.56;
		 int num2=(int)d2;
		 System.out.println(num2);
		 
		 
		 int num3=1000;
		 byte b1=(byte)num3;
		 System.out.println(b1);
		 
	
	
	
	
	}
	
	
	
}
