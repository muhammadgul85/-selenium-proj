package com.may25;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Java-Reyaz\\chromedriver_win32\\chromedriver.exe");
		//System is Java class and setproperty is method in this class
		
		WebDriver driver = new ChromeDriver ();//WebDriver is interface
	//	WebDriver driver1 = new Firefox();
	//	WebDriver driver2 = new edge();

	}

}
/*
findElement(By)
findElements(By)

getCurrentUrl()
getPageSource()
getTitle()
getWindowHandle()
getWindowHandles()
manage()
navigate()
quit()
switchTo()
*/