package com.class8;

public class ForLoopWithString {
public static void main(String[]args) {
	String word="ForLoop";
	for (int i=0;i<word.length();i++) {
		System.out.print(word.charAt(i));
	}
	System.out.println();
	
	//backwards 1st way
//for(int a=word.length()-1;a>=0;a--)	{
//	System.out.print(word.charAt(a));

//2nd way to print backwards
int len=word.length()-1;
for (int b=0;b<word.length();b++) {
System.out.print(word.charAt(len-b));	
	
}
}
}

