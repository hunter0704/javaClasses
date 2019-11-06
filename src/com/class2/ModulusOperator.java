package com.class2;

public class ModulusOperator {
	public static void main (String []args){
//	      char a='*';
//	      String b ="**";
//	      String c="***";
//	      String a1="##";
//	      char b1='#';
//	      System.out.println(a);
//	      System.out.println(b);
//	      System.out.println(c);
//	      System.out.println(a1);
//	      System.out.println(b1);

	
		//Create an int variable called myNumber. Set it equal to any number other than 0.
		int myNumber=100;
     
		
		//Create an int variable called stepOne. Set it equal to the original number (myNumber) multiplied by itself.
		int stepOne=myNumber*myNumber;

		//Create an int variable called stepTwo. Set it equal to the previous result (stepOne) plus the original number (myNumber).
		int stepTwo= stepOne+myNumber;
		//Create an int variable called stepThree. Set it equal to the previous result (stepTwo) divided by the original number.
		int stepThree=stepTwo/myNumber;
		//Create an int variable called stepFour. Set it equal to the previous result (stepThree) plus 17.
		int stepFour=stepThree+17;
		//Create an int variable called stepFive. Set it equal to the previous result (stepFour) minus the original number.
		int stepFive=stepFour-myNumber;
		//Create an int variable called stepSix.Set it equal to the previous result (stepFive) divided by 6.
		int stepSix=stepFive/6;
		//Let's print out the value of the last step as: "The magic number is _ !"
		System.out.println ("The magic number is " +stepSix);
		//Now try running your code! What number is printed to the console?
		//Now, go back to your code and change myNumber to any other integer.
	
	
	}
}




