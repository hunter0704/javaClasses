package com.class16;

public class ClassObjectTask {
String name,brand,color;
int size,price;
boolean camera;
void playGame() {
	System.out.println("I Bought "+color+name+brand);
}
void PlayMusic () {
	System.out.println("I Bought "+color+name+brand);
}



public static void main (String []args) {
	ClassObjectTask phone=new ClassObjectTask();
	phone.name="Apple";
	phone.brand="Iphone Xmax";
	phone.color="red";
	phone.camera=true;
	
	ClassObjectTask phone1=new ClassObjectTask();
	phone1.name="Andriod";
	phone1.brand="googlePixsle";
	phone1.color="siver ";
     phone1.camera=true;
	
     ClassObjectTask phone2=new ClassObjectTask();
	phone2.name="Nokia";
	phone2.brand="I10";
	phone2.color="White";
    phone2.camera=true;

    phone.playGame();
    phone.PlayMusic();
}
}
