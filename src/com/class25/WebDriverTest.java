package com.class25;

public class WebDriverTest {
	public static void main(String[] args) {
		ChromeDriver chrome=new ChromeDriver();
		chrome.refresh();
		chrome.open();
	System.out.println("************************");	
		FireFoxDriver fireFox= new FireFoxDriver();
		fireFox.refresh();
		fireFox.open();
	
	System.out.println("****************************");	
//creating an object of child class and given refernce to the parantes class
	WebDriver webDriver= new FireFoxDriver();
		webDriver.refresh();
		webDriver.open();
//no access to child specific class through Parent type
	}

}
