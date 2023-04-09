package com.methodinwebdriver.may26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsInWebDriver {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Java-Reyaz\\drivers\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver ();
		driver.get("https://adactinhotelapp.com/");
		System.out.println("Title: " + driver.getTitle());
		//System.out.println("Page Source: " + driver.getPageSource());
		Thread.sleep(5000);
		System.out.println("Current URL: "+ driver.getCurrentUrl());
		System.out.println("");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("mogul");
		
		driver.findElement(By.className("build_title")).getText();
		System.out.println(driver.findElement(By.className("build_title")).getCssValue("font-weight"));
		
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("login")).click();
		
		driver.findElement(By.className("login_error")).getAttribute("Id");
		
		
		Thread.sleep(2000);
		System.out.println("window handle");
		driver.getWindowHandle(); 	
		System.out.println("run the code ! It's the end");
		
		
		
		
		
		driver.quit();
	
	
	}

}
