package com.Class10;

public class ArrayWithForLoop1 {
public static void main (String[]args) {
String []animals= {"Dog","Cat","Fish","Cow","Snake"};
int size=animals.length;
for (int i=0;i<size; i++) {
	System.out.println(animals[i]+" ");
}
	
//create an array to store 5 double value 
//print all element in 1 line
 double[]value= {12.0,34.5,0.5,9.0,100.00};
 double size1=value.length;
 for (int a=0;a<size;a++) {
	 System.out.print(value[a]+" ");
 }
 
//I want to print all values from an array
 //when value is Dog-->I love Fog 
 String []animal= {"cow","Cat","Chicken","Dog","Fish"};
 for (int k=0; k<animal.length;k++) {
	 if (animal[k].equals("dog")) {
		 System.out.println(" I love Dogs");
	 }else {
		 System.out.println(animal[k]);
		 
	 }
 }
}	
	
	
}
