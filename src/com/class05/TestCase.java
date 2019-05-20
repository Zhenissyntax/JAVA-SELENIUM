package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Zhenis\\\\Selenium\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	driver.findElement(By.cssSelector("input[id='user-name']")).sendKeys("standard_user");
	driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
	driver.findElement(By.cssSelector("input.btn_action")).click();
	Boolean dis=driver.findElement(By.cssSelector("div.peek")).isDisplayed();
	if(dis) {
		System.out.println("You'r LOGGED IN");
		
	}else {
		System.out.println("You'r NOT LOGGED IN");
	}
	Boolean pro=driver.findElement(By.cssSelector("div.product_label")).isDisplayed();
	if(pro) {
		System.out.println("PRODUCT LOGO is deplayed");
	}else {
		System.out.println("PRODUCT LOGO is not desplayed");
	}
	
}
}
