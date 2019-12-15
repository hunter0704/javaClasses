package com.class25;

public class Degree {
	public void getDegree() {
		System.out.println("I got degree");
	}
class Undergraduate extends Degree{
	public void getDegree() {
		System.out.println("I'm an  Undergraduate");
	}
class Postgradute extends Degree {
	public void getDegree() {
		System.out.println(" I'm an Postgradute ");
	}
}

	
}
}

