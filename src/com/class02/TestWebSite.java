
package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWebSite{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zhenis\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("problem_user");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.className("btn_action")).click();
		Thread.sleep(4000);
		driver.close();
	}
}