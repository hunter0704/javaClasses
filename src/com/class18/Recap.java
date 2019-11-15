package com.class18;

public class Recap {
	void sum(int a,int b) {
		int c=a+b;
		System.out.println(" The sum of the 2 numbers is "+c);
	
	}
	// create methods to display hello 5 times
	void sayHello(int times) {
		for (int i=0;i<times;i++) {
			System.out.println("Hello");
		}
	}
	// create methods to say something number of times
	//parameter come with order we can not switch it 
	void saySomething(String word,int times) {
		for (int i=0;i<times;i++) {
			System.out.println(word);
		}
	}
public static void main(String[] args) {
	Recap obj= new Recap();
	obj.sum(10, 30);
	System.out.println("**************************************************************");
    System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	obj.sayHello(23);
   System.out.println("*********************************************************************");
	obj.saySomething("Good",2);

}
}
