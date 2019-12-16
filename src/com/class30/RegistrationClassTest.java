package com.class30;
/* Create Registration class in which you would have variables
 * as email, userName, and password that have an access scope only
 * within its own  class
 * After creating an object of the class user should be able 
 * to call methods and in each method separately pass values 
 * to set user email, userName and password
 * Requirements:
 * valid email consider to only gmail
 * vaild userName and password cannot be  empty and 
 * should be of length larger than 6 characters
 * Also valid password can not contain userName.*/
 
class RegistractionClass{
	 private String email,userName,password;
	 public void setEmail(String email) {
		 if (email.contains("gmail.com")) {
			 this .email=email;
		 }else {
			 System.out.println("Invalid email type .Email must be gmail");
		 }
	 }
//getting email
public String getEmail() {
	return email;
}
//setting userName
public void setUsername(String userName) {
	if (!userName.isEmpty()) {
	
	if( userName.length()>6) {
			this.userName=userName;
		}else {
			System.out.println("Username should have more than 6 characters");
		}
	}else {
		System.out.println(" UserName cannot be empty");
	}
	}


		//get the userName
	public String getUsername() {
		return userName;
	}
	//setpassword
	public void setPassword(String password) {
		if (!password.isEmpty()) {
			if(password.length()>6) {
				if (!password.contains(userName)) {
					this.password=password;
				}else {
					System.out.println("Password can not contain username");
				}
			}else {
				System.out.println("Password should have more than 6 characters");
			}
			
		}else {
			System.out.println(" Password can not be empty");
		}
	}
	//get password
		public String getPassword() {
			return password;
	
	}
		}
 class RegistrationClassTest {
	 public static void main(String[] args) {
		
		 RegistractionClass obj =new RegistractionClass();
		 obj.setUsername("John123445");
		 System.out.println(obj.getUsername());
	}
 }
 
 
 