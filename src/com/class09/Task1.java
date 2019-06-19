package com.class09;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.CommonMethods;

public class Task1 extends CommonMethods {
	public static void main(String[] args) {
		
	
	String url="https://the-internet.herokuapp.com/";
		CommonMethods.setUpDriver("chrome", url);
		
		   driver.findElement(By.xpath("//a[text()='Dynamic Loading']")).click();
	        driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
	        driver.findElement(By.xpath("//button[text()='Start']")).click();
	        WebElement element=driver.findElement(By.xpath("//h4[text()='Hello World!']"));
	        WebDriverWait wait=new WebDriverWait(driver,10);
	       wait.until(ExpectedConditions.visibilityOf(element));
	       if(element.isDisplayed()) {
	            String text=element.getText();
	            System.out.println(text);
	        }else {
	            System.out.println("Element is not displayed");
	        }
	        driver.quit();
}
}