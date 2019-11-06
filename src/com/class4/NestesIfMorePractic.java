package com.class4;

public class NestesIfMorePractic {
public static void main(String[] args) {
/* check age ,if age is less than 16 --> yous are too young to drive 
 * otherwise  --> you are eligible to drive & we will check 
 * if you are older than 18
 * You can get driver license and if not you can get driver permit 
 * 	
 */
int age =18;
if (age<16) {
	System.out.println("You are too young to drive ");
}else {
	System.out.println(" you are eligilble to drive");
if (age>=18) {
	System.out.println(" You can drive alone ");
}else {
}	System.out.println(" You need your parents to drive");
}
System.out.println("-------------------------------------------------------");
/*we need to check if student completed the quiz
 * if yes---->goo job,if not ----not good
 * if they completed we will check score:
 * if mmore than 90--->you got an A
 * if more than 80-->you got --->B
 * anything blow --->you study more 
 * 
 */
//boolean quiz=true;
//int score =80;
//if (quiz) {
//	System.out.println(" Good Job !!!");
//	if (score>=90) {
//		System.out.println(" You Got A");
//	}else if (score>80) {
//		System.out.println("You Got B ");
//	}else 
//		System.out.println(" You should Study More");
//}else {
//	System.out.println(" Not Good !!!");
//}

//find the number 2digit,3 digit,or 4digits
int num=1;
if (num < 100) {
    if (num >= 10) {
        System.out.println("Its a two digit number");
    }
} else if (num < 1000) {
    if (num >= 100) {
        System.out.println("Its a three digit number");
    }
} else if (num < 10000) {
    if(num >= 1000) {
        System.out.println("Its a four digit number");
    }
} 
else if (num < 100000){
    if(num >= 10000) {
        System.out.println("Its a five digit number");
    }
} else {
    System.out.println("number is not between 1 & 99999");
}
}
}