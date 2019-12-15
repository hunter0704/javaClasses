package com.class29;

public class BankTest {
	// as a tester we dont create INTERFACE developer will create it
	// using interface we can achive to access to multiple inheritance(1 child with multiple parents) and public abstract
	//uing interface we can achive full Abstraction 
	// public static final-->String str="Saturday ";

	public static void main(String[] args) {
		CapitaiOneChild obj = new CapitaiOneChild();
		obj.haveChecking();
		obj.haveSaving();
		obj.trust();
		obj.financing();

		CapitalOne co = new CapitalOne();
		co.haveChecking();
		co.haveSaving();
		co.trust();
		co.financing();

	}

}
