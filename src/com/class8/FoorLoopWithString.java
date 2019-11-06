package com.class8;

public class FoorLoopWithString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "Repaid";
		for (int i = 0; i < word.length(); i++) {
			System.out.print(word.substring(i,i+1));
			//System.out.print(word.charAt(i));
		}

	}

}
