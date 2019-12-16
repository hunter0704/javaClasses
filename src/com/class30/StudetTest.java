package com.class30;
//We have to caculate the percentage of marks obtained in three subjects
//(each out of 100) by student A 
//and in four subjects(each out of 100)by student B
//create class 'Marks' with an abstract method 'getPercentage'
//It's inherited by classes 'A' and 'B' each having a method 
//with the same name which returns the percentage of the students.
//The  constructor of student A takes the marks in three subjects
//as it is parameter for student B.
// Test your code
abstract class Marks{
	public abstract double getPercentage();
}
class studentA extends Marks{
	double math;
	double biology;
	double georgaphy;
 
studentA(double math,double biology,double georgaphy){
	this.math=math;
	this.biology=biology;
	this.georgaphy=georgaphy;
	
}
@Override
public  double getPercentage() {
	double average=(math+biology+georgaphy)/3;
	return average;
}
}
class StudentB extends Marks{
	double math;
	double biology;
	double georgaphy;
  double science;


 public StudentB(double math,double biology,double georgaphy ,double science){
		this.math=math;
		this.biology=biology;
		this.georgaphy=georgaphy;
		this.science=science;
  }
		@Override
		public double getPercentage() {
			double average=(math+biology+georgaphy+science)/4;
			return average;
		}
}
public class StudetTest {

	public static void main(String[] args) {
StudentB b=new StudentB(90,98,78,50);
double averageB =b.getPercentage();
System.out.println(averageB);

studentA a=new studentA(90,80,90);
double averageA=a.getPercentage();
System.out.println(averageA);

	
}
	

}



