package com.class24;

public class Programming {
	Programming (){
		System.out.println(" I love Programming languages" );
	}
	   void Programming (String str ){
			if (str.equals("Language")) {
			System.out.println(" I love Programming languages" +str);
		}
		else {
			System.out.println("I love " +str);
		}
		}
public static void main(String[] args) {
	Programming obj= new  Programming(); 
	obj.Programming("Java");

	
}

}
