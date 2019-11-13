package com.class17;

public class ClassTask {
	
	public static void main(String[] args) {
		ClassTask num=new ClassTask();
		num.largeNumber(23, 567);
		num.largeNumber(600, 90);
		ClassTask number=new ClassTask();
	     number.evenOdd(55);
	     number.evenOdd(88);
	ClassTask isPalindrome=new ClassTask();
	isPalindrome.palindrome("bob", "bob");
	isPalindrome.palindrome("Alex", "xelA");
	}
	//Crete a method that will take 2 parrameters as numbers is large
	// print the large number 
void largeNumber(int a,int b) {
	if (a>b) {
		System.out.println( a+" is the largest number");
	
}else {
	System.out.println(b + "is the largest number");
}

}
// create a method that will take a number and prints whethere the number is even or odd 
void evenOdd(int c) {
	if (c%2==0) {
		System.out.println(" The number is even number");
	
}else { 
	System.out.println(" The number is odd number ");
}
//Create a method that will print whether given Sting is palindrome or not
}
	void palindrome(String orginal, String string) {
		String reversed="";
		for (int i=orginal.length()-1;i>=0;i--){
			reversed=reversed+orginal.charAt(i);
		}
		if(orginal.equals(reversed)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not palindrome ");
		}
	}
		

}
