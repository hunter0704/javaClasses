package com.class29;
interface TakesScreenshot{
	void takesScreen();
}

public interface WebDriver extends TakesScreenshot{
	//those are the behavoir we must provide 
	void openBrowser();
	
	void closeBrowser();
	
	void maximazeWindow();
	
	void findElement();
	

}
 abstract class Browser{
  public abstract  void refresh();
 }
class ChromeDrive  extends Browser implements WebDriver,Application{

	@Override
	public void openBrowser() {
		System.out.println("Open Chrome Browser");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Close Chrome Browser");
	}

	@Override
	public void maximazeWindow() {
		System.out.println("Maximize window in chrome browser");
		
	}

	@Override
	public void findElement() {
		System.out.println("Find Element by XPath in chrome browser");
		
	}
	@Override
	public void refresh() {
		System.out.println("Refresh Chrome Browser");
		
	}

	@Override
	public void takesScreen() {
		System.out.println("Take screenShot with  Chrome Browser");
		
	}
}
	class FirefoxDriver extends Browser implements WebDriver{

		@Override
		public void openBrowser() {
			System.out.println(" Open FireFox Browser");
			
		}

		@Override
		public void closeBrowser() {
System.out.println(" Close FireFox Browser");
			
		}

		@Override
		public void maximazeWindow() {
			System.out.println("Maximize window in firefox  browser");
			
		}

		@Override
		public void findElement() {
			System.out.println("Find Element by CCS selector");
			
		}

	
	@Override
	public void refresh() {
		System.out.println("Refresh Firefox Browser");
		
	}
	@Override
	public void takesScreen() {
		System.out.println("Take screenShot with  Chrome Browser");
	}
	}