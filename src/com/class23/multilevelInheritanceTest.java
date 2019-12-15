package com.class23;

public class multilevelInheritanceTest {
public static void main(String[] args) {
	
	ParentClassA  ParentClassA =new ParentClassA ();
	System.out.println(ParentClassA.computerType);
	System.out.println(ParentClassA.name);
	System.out.println(ParentClassA.webBrowser);
	ParentClassA.gaming();
System.out.println("**************************************************************");
	
ChildClassB ChildClassB= new ChildClassB();
System.out.println(ChildClassB.computerType);
System.out.println(ChildClassB.name);
System.out.println(ChildClassB.webBrowser);
ChildClassB.flipScreen();
ChildClassB.touchscreen();


}
}

