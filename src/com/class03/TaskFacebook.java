package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskFacebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Zhenis\\\\Selenium\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://facebook.com");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Forgot")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath("//input[@class='inputtext']")).sendKeys("zhenisismagambetov@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("asd123456789");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		Thread.sleep(3000);
		driver.close();
		
	}

}
