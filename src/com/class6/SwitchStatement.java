package com.class6;

public class SwitchStatement {
	public static void main (String[]args) {
	//7 weekdays
		// if day== 1--->Monday
		//if day==2 -->Tuesday
		int day=1;
		String weekDay = null;
		
		switch(day) {
		
		case 1:
			weekDay="Monday";
			break;
		case 2:
			weekDay="Tuesday";
			break;
		case 3 :
			weekDay="Wedsday";
			break;
		case 4: 
			weekDay="Thrsday";
			break;
		case 5:
			weekDay="friday";
			break;
		case 6:
			weekDay="Saturday";
		break;
		case 7:
			weekDay="Sunday";
		break;
		default:
			weekDay="Invaild";
		}
	System.out.println(weekDay);
	}	
		
	}



