package com.class29;

public class WebDriverTest {
	//Abstract Class Vs Interface
	// we can implement multiple Interfaces but we can extend only 1 class 
	// To create a relationship to the interface we use implements keyword 
	// To create a relationship to the classes we use extends 
	//Interface dose not have a constructor 
	// Abstract class have constructor 
	//Interface dose not have instance variables by defalut every variable is STATIC FINAL and it MUST BE INITILIZE 
	//Abstract class we can have both static and instance variables and we do need to intilaize them
	//Inside Interface abstract method can be only public 
	//Inside Abstarct Class can be any access modifier expect private
	/*In Interface we can have only abstarct method,but since java 8 we can have default and static implemented
	 * methods, while no restriction in abstract class defind and undefined
	
	*/
// Interface & Abstarct class similarities 
	//Both help to achieve abstraction
	 // Both can have implemented and unimplemented methods
	 // Both MUST participate in Interface
	 /// for Both  we cant create an object 
	 
	public static void main(String[] args) {
		// we can't create objectof interface or abstract class we use child class to create an object
		WebDriver driver=new ChromeDrive();
		driver.openBrowser();
		driver.closeBrowser();
		driver.maximazeWindow();
		driver.findElement();
	    driver.takesScreen();

	    WebDriver driver1=new FirefoxDriver();
	    driver1.openBrowser();
	    driver1.closeBrowser();
	    driver1.maximazeWindow();
	    driver1.findElement();
	    driver1.takesScreen();
	}

}
