package com.class5;

public class LogicalOrExample {
public static  void main (String[]args) {
//7 days a week
//	if days is 2 or 4-->SDLC class
// if days is 6 or 7-->Java Class
//if day 1 or 5 ---> No class
//if day ==3-->review class

	int day =6;
	if(day==2 ||day==4) {
		System.out.println(" SDLC Class");
	}else  if (day ==6 || day==7) {
		System.out.println("Java Class");
	}else if(day==1 || day ==5) {
		System.out.println(" No Class");
	}else if (day==3) {
		System.out.println(" Review Class");
	}else {
		System.out.println(" invaild");
	}
	//7 days a week
//	if days is Tuesday or Thursday-->SDLC class
// if days is Saturday or Sunday-->Java Class
//if day Monday or Friday ---> No class
//if day ==wednsday-->review class
	String weekDays="Sunday";
	if (weekDays.contentEquals("Tuesday")||weekDays.contentEquals("Thursday")) {
	System.out.println("SDLC Class");
}else if (weekDays.equals("Saturday") ||weekDays.equals("Sunday")) {
	System.out.println("Java Class");
}else if (weekDays.contentEquals("Monday") || weekDays.contentEquals("Friday")) {
	System.out.println(" No Class");
}else if (weekDays.equals("weddnsday")) {
	System.out.println("Review Class ");
}else {
	System.out.println(" invaild");

}

	
}
}
