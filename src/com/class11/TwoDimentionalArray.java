package com.class11;

public class TwoDimentionalArray {
	public static void main (String[]args) {
	// declare 2d arary
		//int [] [] array =new int [3][4];
		// 1st row
//		array[0][0]=44;
//		array[0][1]=80;
//		array[0][2]=56;
//		array [0][3]=33;
		//2nd row 
//		array[1][0]=54;
//		array[1][1]=44;
//		array[1][2]=56;
//		array[1][3]=8;
		//3rd row
//		array[2][0]=34;
//		arary[2][1]=65;
	//	array[2][2]=90;
		//array[2][3]=890;
	
		
		String [][]array=new String[2][3];
		array[0][0]="School";
		array[0][1]="Monday";
		array[0][2]="Sunday";
		array[1][0]="Seda";
		array[1][1]="Gunay";
		array[1][2]="Money";
		System.out.println(array[1][2]);
	
	int [][]numbers= {
			{8,9,3,20,9},
			{20,98,90,45,8},
			{6,7,4,3,2}
			
	};
	System.out.println(numbers[1][4]);
	// To identify the numbers of the rows
	System.out.println(numbers.length);
	//To identify the number of columns//elements in a row
	System.out.println(numbers[2].length);
	for (int i=0;i<numbers.length;i++) {
		for (int j=0;j<numbers[i].length;j++) {
			System.out.print(numbers[i][j] + " ");
		}
	System.out.println();
	}
	
	
	
	}

}
