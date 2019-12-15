package com.class24;

public class Overloading {
	private void methodOne () {
		System.out.println("I'm method one" );
	}
// can we overload a main method?---> Yes we can by changing String []args 
// can overload a static method?----> yes we can
// can we overload privatemethod--<yes we can
// we can overload consturctors
// Operator overloading(+)
// with String -->behaves as concatenation operator
// with numbers-->behaves as math operator
//Runtime polimorephism/dynamic binding/late binding can be achieved through methos overriding

	private void methodOne (String str) {
		System.out.println("I'm method one with "+str);
}
	public static void main(String[] args) {
		System.out.println(" I'm an main method");
	}
	}