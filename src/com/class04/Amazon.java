package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Zhenis\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.cssSelector("div.nav-search-field")).sendKeys("iphone x");
	}

}
