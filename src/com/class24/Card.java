package com.class24;
// defintion a class with 2 method 
public class Card {
	public void chargeInterst() {
		System.out.println("Credit charge  25% ");
	}
public void creditLimit() {// overridden
	System.out.println("Credit limit of the card is 5000");
}
}
class AX extends Card{
	public void creditLimit() {
		System.out.println("Credit limit of the AX card is 25000");
	}

class MC extends Card{
	public void creditLimit() {
		System.out.println("Credit limit of the MC card is 15000 ");
	}
public void cashBack() {
	System.out.println("MC gives cash back of 3%");
}


}

}
