
package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebSite{
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zhenis\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
		driver.findElement(By.id("customer.firstName")).sendKeys("Bob");
		driver.findElement(By.name("customer.lastName")).sendKeys("Bob123456");
		driver.findElement(By.name("customer.address.street")).sendKeys("879 New York ave. apt 701");
		driver.findElement(By.name("customer.address.city")).sendKeys("New York");
		driver.findElement(By.name("customer.address.state")).sendKeys("NY");
		driver.findElement(By.name("customer.address.zipCode")).sendKeys("33489");
		driver.findElement(By.name("customer.phoneNumber")).sendKeys("2408974567");
		driver.findElement(By.name("customer.ssn")).sendKeys("457891578");
		driver.findElement(By.name("customer.username")).sendKeys("James123");
		driver.findElement(By.name("customer.password")).sendKeys("asd123456789");
		driver.findElement(By.name("repeatedPassword")).sendKeys("asd123456789");
		driver.findElement(By.className("button")).click();
		driver.findElement(By.name("username")).sendKeys("James123");
		driver.findElement(By.name("password")).sendKeys("asd123456789");
		driver.findElement(By.className("button")).click();
		
	}
}