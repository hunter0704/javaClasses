package com.class27;

public class Task {
	//Write program: userClass  that has a constructor that initializes name and mobile number 
	//istance variables.
	//Create a subclass  userInfo that will have user address variable and
	// it also being initialized through constructor call. 
//Print users name, mobile number and address in userDetails method. Test your code.
	String name, phoneNumber;
	
Task(String name,String phoneNumber){
	this.name=name;
	this.phoneNumber=phoneNumber;
}
}
class UserInfo extends Task{
	String address;
	UserInfo(String name,String phoneNumber, String address){
		super(name,phoneNumber);
		this.address=address;
		}
public  void userDetial() {
	System.out.println(name+" "+phoneNumber+" "+address);
}
}