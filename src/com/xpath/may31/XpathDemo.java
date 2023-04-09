package com.xpath.may31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Java-Reyaz\\drivers\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//href ref of forget Password, click on Forget Password, Publish Title and URL of the link
		
		System.out.println("Title: "+ driver.getTitle());
		WebElement forgetlink = driver.findElement(By.xpath("//a[text()='Forgot Password?']"));
		
		//getting attribute   <a href="ForgotPassword.php">Forgot Password?</a>
		System.out.println("href of forgetPass: " +forgetlink.getAttribute("href"));
		
		forgetlink.click();
		Thread.sleep(5000);
		
		System.out.println("Current URL: " + driver.getCurrentUrl());
		WebElement recoveryEmail = driver.findElement(By.xpath("//input[@id='emailadd_recovery']"));
		recoveryEmail.sendKeys("abcdefgh");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='Submit']")).click();
		
		Thread.sleep(2000);
		driver.quit();	
	}

}
