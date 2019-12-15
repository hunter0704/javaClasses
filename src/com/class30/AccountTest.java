package com.class30;

public class AccountTest {

	public static void main(String[] args) {
   Account acc= new Account();
   acc.setAccountNumber(123456789);
   long accountNum=acc.getAccountNumber();
   System.out.println(accountNum);
   
   acc.setBalance(200);
   double myBalance=acc.getBalance();
   System.out.println(myBalance);
   int num=123;
   String.valueOf(num);//__>Convert given value to String
   
  
	}

}
