package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Zhenis\\\\Selenium\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.cssSelector("input[id='user-name']")).sendKeys("problem_user");
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret123sauce");
		driver.findElement(By.cssSelector("input.btn_action")).click();
		Boolean error=driver.findElement(By.cssSelector("h3[data-test='error']")).isDisplayed();
		if(error) {
			System.out.println("You'r NOT LOGGED IN");
		}else {
			System.out.println("You'r LOGGED IN");
		}
	}

}
