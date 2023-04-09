package com.may25;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxLaunch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Documents\\Java-Reyaz\\drivers\\geckodriver.exe");
		//System is Java class and setproperty is method in this class
		
		WebDriver driver = new FirefoxDriver ();//WebDriver is interface
		driver.get("https://adactinhotelapp.com/");
		String title = driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(4000);
		
		driver.quit();

	}

}
