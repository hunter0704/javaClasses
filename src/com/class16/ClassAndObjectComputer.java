package com.class16;

public class ClassAndObjectComputer {
// Define feature ,attributes
String brand,name,mouse,monitor;
boolean keyboard;
int size,ram,memory,screen;
//Define behavior,actions
void playGames() {//method header
//method body
System.out.println("I can play on my "+name);

}
void javaCoding() {
	System.out.println("I can do Java coding on my "+name);
}
void watchMovie() {
	System.out.println(" I can watch movie on my" +name);
}
public static void main(String[] args) {
	ClassAndObjectComputer com=new ClassAndObjectComputer();
	com.brand="Apple";
	com.name="MackBook Pro";
	com.memory=250;
	
	System.out.println("I have"+" " +com.brand+" "+ com.name);
	com.javaCoding();
	com.watchMovie();
	com.playGames();

	ClassAndObjectComputer com2=new ClassAndObjectComputer();
com2.brand="ASUS";
com2.name="S45";
com2.memory=125;

System.out.println("I have " + " " +com2.brand+ " " +com2.name);
com2.javaCoding();
com2.watchMovie();
com2.playGames();

}



}
