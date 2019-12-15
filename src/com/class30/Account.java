package com.class30;

public class Account {
	//Best example  of encapsulation is class To create a tightly encapsulated class 
	// we need  to :
	//1)Create a private data members(variable)
	//2) create public methods to access those variables
	//We call them getters and setter methods
	 private long accountNumber;
	 private double balance;
	 
	 public  long getAccountNumber() {
            return accountNumber;
	 }
	public double getBalance() {
		return balance;
	}
// create setter->will give us access 
	public void setBalance(int amount) {
		if (amount>0) {
		balance=balance+amount;
		}
	}
public void setAccountNumber(long accountNumber) {
	if(String.valueOf(accountNumber).length()==9) {
	this.accountNumber=accountNumber;
}
}
}