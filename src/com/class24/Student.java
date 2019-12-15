package com.class24;
/* when we overriding we Cant not reduce a visibility of a method
but can be IN */ 
// public -->protected-->default-->private

public class Student {
	public void study() {
		System.out.println("student needs to study ");
	}
	private void doHomework() {
		System.out.println(" student needs to do homework");
		
	}
	protected void reserach() {
		System.out.println(" Student needs to research");
	}
 void attendingClass() {
	System.out.println(" Student needs to attandening the class");
}
 
}
class SyntaxStudent extends Student{
	public  void doHomework() {
		System.out.println("Syntax student needs to do homework");
	}
	
	public void study() {
		System.out.println("  Syntax student needs to study really hard");
		
	}
	public void coding () {
		System.out.println(" Syntax got a coding job");
	}
	
}class CollegeStudent extends Student{
	public void doHomework() {
		System.out.println("  student love sport");
	}
public void study() {
	System.out.println(" study hard");
}

}
class SchoolStudent extends Student{
	public void offDay() {
		System.out.println(" School student have  a day off");

	}
	
	}
