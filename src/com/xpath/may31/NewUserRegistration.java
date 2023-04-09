package com.xpath.may31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewUserRegistration {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Java-Reyaz\\drivers\\chromedriver.exe");
		
		WebDriver chromed = new ChromeDriver ();
		chromed.get("https://adactinhotelapp.com/");
		chromed.manage().window().maximize();
		System.out.println("Title: " + chromed.getTitle());
		System.out.println("URL: " + chromed.getCurrentUrl());
		
		WebElement NewUser = chromed.findElement(By.xpath("//a[text()='New User Register Here']"));
		
		//href of Element
		System.out.println("href of NewUser: "+NewUser.getAttribute("href"));
		
		NewUser.click();
		
		Thread.sleep(5000);
		// Current Link
		
		System.out.println("URL of NewUser Reg: " + chromed.getCurrentUrl());
		
		//Title
		System.out.println("Title: "+ chromed.getTitle());
		
		//Username -  <input name="username" type="text" class="reg_input" id="username" value="" maxlength="20"> 		
		
		WebElement Username = chromed.findElement(By.xpath("//input[@id='username']"));
		Username.sendKeys("Reyaz222");
		Thread.sleep(2000);
		
		// Password = <input name="password" type="password" class="reg_input" id="password" value="" maxlength="20" aria-autocomplete="list">
		WebElement Pass = chromed.findElement(By.xpath("//input[@id='password']"));
		Pass.sendKeys("123456@@@");
		Thread.sleep(2000);
		
		
		//Confirm Password -- <input name="re_password" type="password" class="reg_input" id="re_password" value="" maxlength="20">
		
		WebElement ConfPass = chromed.findElement(By.xpath("//input[@name='re_password']"));
		ConfPass.sendKeys("123456@@@");
		Thread.sleep(2000);
		
		//Full Name =>  <input name="full_name" type="text" class="reg_input" id="full_name" value="" maxlength="50"> 
		
		WebElement fullName = chromed.findElement(By.xpath("//input[@name='full_name']"));
		fullName.sendKeys("Reyaz Shaikh");
		Thread.sleep(2000);
		
		//Email Address=> <input name="email_add" type="text" class="reg_input" id="email_add" value="" maxlength="50">
		WebElement EmailAdd = chromed.findElement(By.xpath("//input[@name='email_add']"));
		EmailAdd.sendKeys("ReyazShaikh@gmail.com");
		Thread.sleep(2000);
		
		//Enter Captcha Image-ignore => <input type="text" name="captcha" id="captcha-form" maxlength="8" class="reg_input" value="">
		
		WebElement captcha = chromed.findElement(By.xpath("//input[@id='captcha-form']"));
		captcha.sendKeys("abcdef");
		Thread.sleep(3000);
		
		//CheckBox Terms and Conditions  <input type="checkbox" name="tnc_box" id="tnc_box" value="1">
		WebElement checkBox = chromed.findElement(By.xpath("//input[@id='tnc_box']"));
		checkBox.click();
		Thread.sleep(2000);
		
		//Register  =>  <input type="submit" name="Submit" id="Submit" class="reg_button" value="Register">
		WebElement Register = chromed.findElement(By.xpath("//input[@id='Submit']"));
		Register.click();
		Thread.sleep(5000);
		
		
		chromed.quit();
		
		
		
	}

}
