package com.class23;
//

public class InheritanceParentsChildTest {
	public static void main(String[] args) {
		InheritanceChild  InheritanceChild =new InheritanceChild ();
		System.out.println(InheritanceChild .race);
		System.out.println(InheritanceChild.hairColor);
		System.out.println(InheritanceChild .eyeColor);
		InheritanceChild .code();
		InheritanceChild .sing();
		
		InheritanceParent InheritanceParent=new InheritanceParent();
		System.out.println(InheritanceParent.race);
		System.out.println(InheritanceParent.hairColor);
		System.out.println(InheritanceParent.eyeColor);
		InheritanceParent.sing();
		
		InheritanceChild2  InheritanceChild2=new InheritanceChild2();
		System.out.println(InheritanceChild2.eyeColor);
		System.out.println(InheritanceChild2.hairColor);
		System.out.println(InheritanceChild2.race);
		
         InheritanceChild2.scrumMaster();
	}

}
