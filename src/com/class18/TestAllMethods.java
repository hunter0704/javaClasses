package com.class18;

public class TestAllMethods {
	public static void main(String[] args) {
// find the largest from 300 and500
// then identify is the largest number is
		AllMEthods obj =new AllMEthods();
		int large=obj.findLargest(300, 500);
		System.out.println(large);
        boolean odd =obj.isOdd(large);
        System.out.println(odd);

//call method weekSayName
 // if out put will be 
 //tuesday ,wendsday,thrusday,saturday,sunday
//Im learning java on those day 
 String day= obj.weekDayName(5);
 if (day.equals("Tuesday")|| day.equals("Wendsday")
		 ||day.equals("Thursday")||day.equals("Saturday")
		 ||day.equals("Sunday")) {
	 System.out.println(" I'm learning Java");
	 
 }else {
	 System.out.println(" I'm practcing Java ");
 }
	}
	}