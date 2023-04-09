package com.may25;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeLaunchDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\User\\Documents\\Java-Reyaz\\drivers\\msedgedriver.exe");//tried EdgeDriver.exe
		//System is Java class and set-property is method in this class
		
		WebDriver driver = new EdgeDriver();//
		driver.get("https://adactinhotelapp.com/");
		
		//Thread.sleep(4000);
		
		driver.quit();

	}

}
