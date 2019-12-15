package com.class18;

public class ReturnStatement {
	public static void main(String[] args) {
		printAMessage();
		int sum=add(5,14);
//	System.out.println(sum);
		String shouting=caps();
		
	}
	
	public static void printAMessage() {
		System.out.println("This is our frist ,methods!");
	}
	public static int add(int a,int b) {
		System.out.println(a+b);
		return a+b;
	}
	
	public static String caps() {
	return ;
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
