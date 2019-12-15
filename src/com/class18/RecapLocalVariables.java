package com.class18;

public class RecapLocalVariables {
	public static void main(String[] args) {
		// I want to access varible myName from diffrent method
		RecapLocalVariables obj=new RecapLocalVariables();
		obj.sayName();
		System.out.println();
		//RecapLocalVariables object=new RecapLocalVariables();
	System.out.println(obj.createEmail("Jhon", "Smith", "Outlook"));
		
	}

	void sayName() {
		String myName="John";
		System.out.println(myName);
	}
// create an email 
// variable declared inside the class and inside the method. The scope 
	String createEmail(String name,String lastName,String email) {
		String userEmail=name+lastName+ "@"+email+ ".com ";
		return userEmail;
	
	}
}
