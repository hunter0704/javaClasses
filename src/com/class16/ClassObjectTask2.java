package com.class16;

public class ClassObjectTask2 {
	String name, breed, color, size;
	int age;

	void bark() {
		System.out.println(breed + " barking everyday");
	}

	void eat() {
		System.out.println(name + " eating chicken");

	}

	public static void main(String[] args) {
		ClassObjectTask2 dog = new ClassObjectTask2();
		dog.name = "Zoe";
		dog.breed = "Huskey";
		dog.color = "White";
		dog.size = "Large";
		dog.age = 1;

		ClassObjectTask2 dog1 = new ClassObjectTask2();
		dog1.name = "charlie";
		dog1.breed = "Bulldog";
		dog1.color = "Brown";
		dog1.size = "small";
		dog1.age = 3;

		ClassObjectTask2 dog2 = new ClassObjectTask2();
		dog2.name = "sally";
		dog2.breed = "Labrador";
		dog2.color = "Black";
		dog2.size = "small";
		dog2.age = 4;

		dog.bark();
		dog.eat();
       
		dog1.bark();
		dog1.eat();
	}

}
