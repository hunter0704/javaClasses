package com.class18;

public class StaticAndInstanceVariable {
	String name;
	String color;
	
	static String breed="Husky";
	static int paws=4;
	static int tail=1;
	void display() {
		System.out.println("Name is "+ name+" breed is "+breed);
	}
	

	 public static void main(String[] args) {
		StaticAndInstanceVariable puppy1=new StaticAndInstanceVariable();
		StaticAndInstanceVariable puppy2= new StaticAndInstanceVariable();
		
		puppy1.name="Zoe";
		puppy1.color="Black";
		puppy1.display();
		
		puppy2.name="Charlie";
		puppy2.color="popColor";
		puppy2.display();
		System.out.println("Changing breed");
		
		StaticAndInstanceVariable puppy3=new StaticAndInstanceVariable();
		puppy3.name="Jack";
		puppy3.color="grey";
		breed="Bulldog";
		puppy3.display();
		
		puppy2.display();
		puppy1.display();
		
		
	}

}
