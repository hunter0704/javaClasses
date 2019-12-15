package com.class26;

public class FinalKeyword {
	public final String str="Hello";

	public static void main(String[] args) {
//		String str="I'm awsome";
//		str=" I'm cool";
//		System.out.println(str);
//		
//		final String finalString="Java is easy";
//		//finalString ="Java is hard "; compiler error-->
//		final int age =120;
//		//age= 100; compiler error 
//		FinalKeyword obj=new FinalKeyword();
//		System.out.println(obj.str);
		public final void hello() {
			System.out.println("I'm a final  method in parent class");
		}
		
	}
class FinalKeywordChild extends FinalKeyword{
//	public final void hello() {// final method cannot be overriden, we will get compiler error
//		System.out.println();
//	}
}
}
