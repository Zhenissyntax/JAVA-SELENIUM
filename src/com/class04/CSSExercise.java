package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSExercise {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\Zhenis\\\\\\\\Selenium\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.cssSelector("input#email")).sendKeys("James123");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("J123456789");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("J123456789");
		driver.findElement(By.xpath("//input[@type='image']")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
