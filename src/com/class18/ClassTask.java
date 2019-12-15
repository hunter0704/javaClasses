package com.class18;

public class ClassTask {
//create a method createEmail().
//Based on provided user name lastName 
//and email type your method should return
//should return complite email Address
//example :Johnsnow@gmail.com
// or johnsnow@yahoo.com
	
String email (String userName,String lastName,String emailType) {
	String compliteEmail=(userName+lastName +emailType);
	return compliteEmail;
}
 //Write a methods to return wheather givin number is prime or not
	boolean prime(int num) {
	boolean primeNum=true;
	return primeNum;
	
	}





public static void main (String[]args) {
		ClassTask emailAddress=new ClassTask();
		String emailA=emailAddress.email("john ", "snow "," @gmail.com");
		System.out.println(emailA);
	}



}
