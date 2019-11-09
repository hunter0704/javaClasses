package com.class15;

public class InterviewQuetion3 {
	//Find out how many alpha characters present
public static void main(String[] args) {
	String str ="Hello 6876868 *&^^ , welcomeguggiugug!!!!";
	str=str.replaceAll("[^a-zA-Z]", "");
	System.out.println(str.length());
}
}
