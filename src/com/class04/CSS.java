package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class CSS {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\Zhenis\\\\\\\\Selenium\\\\\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.saucedemo.com/");
	driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("standard_user");
	driver.findElement(By.xpath("//input[starts-with(@type,'pa')]")).sendKeys("secret_sauce");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[starts-with(@type,'s')]")).click();
	Thread.sleep(3000);
	driver.close();
	
}
}
