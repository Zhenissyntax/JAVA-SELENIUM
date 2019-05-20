package com.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
	public static void main(String[] args) throws InterruptedException {
		   System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Zhenis\\\\Selenium\\\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
	        driver.findElement(By.cssSelector("button[onclick='myAlertFunction()']")).click();
	        Alert simpleAlert = driver.switchTo().alert();
	       System.out.println("Alert box Presented text: "+ simpleAlert.getText());
	       Thread.sleep(2000);
	       simpleAlert.accept();
	       
	       System.out.println("------------------------");
	       driver.findElement(By.cssSelector("button[onclick='myConfirmFunction()']")).click();
	        Alert simpleAlert2 = driver.switchTo().alert();
	       System.out.println("Confirm box Presented text: "+ simpleAlert2.getText());
	       Thread.sleep(2000);
	       simpleAlert2.accept();
	       System.out.println("--------------------------");
	       
	       driver.findElement(By.cssSelector("button[onclick='myPromptFunction()']")).click();
	        Alert simpleAlert3 = driver.switchTo().alert();
	       System.out.println("Prompt box Presented text: "+ simpleAlert3.getText());
	       Thread.sleep(2000);
	       simpleAlert3.accept();
	       Thread.sleep(2000);
	       driver.close();
	        
	        
		
		
	}

}
