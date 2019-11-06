package com.Class10;

public class ArrayTask {
	public static void main (String []args) {
		
	char[]array=new char[6];
	array[0]='A';
	array[1]='B';
	array[2]='C';
	array[3]='D';
	array[4]='E';
	array[5]='F';
	System.out.println(array[1]);
	// 2nd way 
	char []grade= {'A','B','C','D','E','F'};
	System.out.println(grade[1]);
		
	//Task 2
	String []name=new String[7];
	name[0]="Seda";
	name[1]="Gunay";
	name[2]="Shubha";
	name[3]="Fabi";
	name[4]="Eric";
	name[5]="Shugal";
	name[6]="Emily";
	System.out.println(name[6]);
		
	String[] groupName= {"Seda","Shubah","Gunay","Shugal","Eric","Fabi","Emily"	};
	System.out.println(groupName[6]);
	
//Task 3
String[]words= {"Java","Saturday","day","coding","is"};
System.out.println(words[1] +" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
		
		
		
	}

}
