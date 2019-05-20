package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercises {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Zhenis\\\\Selenium\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[starts-with(@type,'e')]")).sendKeys("zhenisismagambetov@gmail.com");
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("asd123456789");
		driver.findElement(By.xpath("//input[contains(@value,'Log')]")).click();
		Thread.sleep(3000);
		driver.close();
		
	}

}
