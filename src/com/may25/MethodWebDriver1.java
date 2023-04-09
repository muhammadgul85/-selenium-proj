package com.may25;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodWebDriver1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Java-Reyaz\\drivers"
				+ "\\chromedriver_win32\\chromedriver.exe");
		//System is Java class and setproperty is method in this class
		
		WebDriver driver = new ChromeDriver ();//WebDriver is interface
		driver.get("https://adactinhotelapp.com/");
		
		//Thread.sleep(4000);
		
		driver.quit();
		
		
		
		
	}

}
