package com.class11;

public class SumOf2DArray {
public static void main(String[] args) {
int [][] numbers = {
		{8,0,89,67,49},
		{7,45,34,2,3},
		{23,45,12,3,4,6}
		
};

int sum=0;
for (int i=0;i<numbers.length;i++) {
	for (int j=0;j<numbers[i].length;j++) {
		sum=sum+numbers[i][j];
	}
	System.out.println();
	
	}
System.out.println("The sum of all element in the array is = " +sum);

int sum1=0;
for (int nums[]:numbers) {
	for (int getNum:nums) {
		if(getNum%2==0) {
			System.out.println(getNum+ "Is Even Number");
			
		}
		sum1=sum1+getNum;

	 
	}
}

System.out.println(" The sum of all element in the array is =" +sum1);
}

}