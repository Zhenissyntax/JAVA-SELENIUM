package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteRealativeXPath {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\Zhenis\\\\\\\\Selenium\\\\\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(3000);
	driver.close();
}
}
