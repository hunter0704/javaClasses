package com.class3;

public class ifElseTask {
public static void main(String[]args) {
	//Create a Java program and name it Double Comparison. 
	//Declare 2 double values and if value of first variable is higher then 
	//print “Double value __ is larger than __ .” Otherwise print...
	double a=100.9;
	double b=289.8;
	if (a>b) {
		System.out.println("Double value"+b+"is larger than"+a);
		}
	else {
		System.out.println("......");
	}
	
	
	
	//Create a Java program and name it Temperature Check. 
	//Create variable to store temperature.
	//Your program should check if temperature is below 32 then it
	//should print “Water will freeze with temperature __”, 
	//otherwise “Water will NOT freeze with temperature __”.
int TemperatureCheck=-40;
int storeTemperature=60;
if (TemperatureCheck<32) {
	System.out.println("Water will freeze with temperature"+TemperatureCheck);
	
}
else {
	
	System.out.println("Water will NOT freeze with temperature"+storeTemperature);
}

boolean val=true;
if(val) {//if val==true
	System.out.println("hello");
}
else {
	System.out.println("bye");
}

boolean isRain=false;
//if it's raining I will take umbrella,otherwise i go for a walk
if(isRain) {//isRain==true
	System.out.println("I will take umbrella");
	
}else {
	System.out.println("I will go for  a walk");
}

int num1=100;
int num2=100;
if (num1>num2) {
	System.out.println("num1 is larger than num2");
	}else if (num1==num2) {
		System.out.println("num1 equal to num2");
		
	}else {
		
		System.out.println("num1 is smaller than num2");
	}
int day=6;
if(day==1) {
System.out.println(" Today is Monday. I have to go to work");	
	}
else if (day==2) {
	System.out.println("Today  is tuesday.I have SDLC class");	
	}
else if (day==3) {
	System.out.println("Today is Wednesday.I have Java review class");
}
else if (day==4) {
	System.out.println(" Today is Thursday.I have SDLC review class");
}
else if (day==5) {
	System.out.println("Today is Friday Weekend is here ");
}
else if (day==6) {
	System.out.println(" Today is Saturday .my favorite coding day");
	
}
else if (day==7) {
	System.out.println(" Today is Sunday");
}
else {
	System.out.println("I dont know what day is this ");
}


}






 }
