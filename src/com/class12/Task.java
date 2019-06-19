package com.class12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.CommonMethods;

public class Task  {
	/*TC 1: OrangeHRM Login

Navigate to “https://opensource-demo.orangehrmlive.com/”
Login to the application
Verify user is successfully logged in

Note: must use properties file
	 
	 */
Properties prop;
	
	@Test
	public void readFile() throws InterruptedException {
		
		String filePath="configs\\credential.properties";
		
		try {
			FileInputStream fis=new FileInputStream(filePath);
			prop=new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		
		CommonMethods.setUpDriver(prop.getProperty("browser"), prop.getProperty("url"));
		CommonMethods.driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
		CommonMethods.driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("admin123");
		CommonMethods.driver.findElement(By.cssSelector("input#btnLogin")).click();
		WebElement s=CommonMethods.driver.findElement(By.xpath("//input[@value='Marketplace']"));
		if(s.isDisplayed()) {
			System.out.println("You are  Logged IN");
		
		}else {
			System.out.println("NOT LOGGED IN");
		}
		
		Thread.sleep(3000);
		CommonMethods.driver.close();
		
	}
}

