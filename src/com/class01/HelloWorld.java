
package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorld{
	public static void main(String[] args) {
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zhenis\\Selenium\\chromedriver.exe");
	//	WebDriver driver=new ChromeDriver();
	//	driver.get("http://amazon.com");
		//driver.get("http://facebook.com");
		
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Zhenis\\Selenium\\geckodriver.exe");
			WebDriver driver= new FirefoxDriver();
			driver.get("http://amazon.com");
			
	}
}