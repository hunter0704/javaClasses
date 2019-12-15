package com.class27;

public class CarTEst {

	public static void main(String[] arg)
	{
		Tesla tesla =new Tesla();
		Tesla tesla1=new Tesla("Tesla" ,"S4",true);
		tesla1.displayInfo();
		System.out.println("***************************************************************");
		Tesla tesla2=new Tesla("Tesla xl","S8",false);
		tesla2.displayInfo();
	}
public void helloName(String name) {
	System.out.println("Hello " +name);
}
}
