package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	public static void main(String[] args) throws InterruptedException {
	//	TC 2: Mercury Tours Registration:
		//	Open chrome browser
		//	Go to “http://newtours.demoaut.com/”
		//	Click on Register Link
		//	Fill out all required info
		//	Click Submit
		//	User successfully registered
		//	(Create 2 scripts using different locators)
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Zhenis\\\\Selenium\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("John");
		driver.findElement(By.name("lastName")).sendKeys("Johnson");
		driver.findElement(By.name("phone")).sendKeys("2405897648");
		driver.findElement(By.id("userName")).sendKeys("johnson@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("3000 Internation dr apt.225");
		driver.findElement(By.name("city")).sendKeys("Mclean");
		driver.findElement(By.name("state")).sendKeys("VA");
		driver.findElement(By.name("postalCode")).sendKeys("22102");
		driver.findElement(By.name("email")).sendKeys("johnson@gmail.com");
		driver.findElement(By.name("password")).sendKeys("asd123456789");
		driver.findElement(By.name("confirmPassword")).sendKeys("asd123456789");
		driver.findElement(By.name("register")).click();
		Thread.sleep(5000);
		driver.close();
		
		
		
	}

}
