package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class DoubleClick extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUpDriver("chrome", "https://www.saucedemo.com/");
		driver.findElement(By.cssSelector("input#password")).sendKeys("123");
		WebElement DoubleClick=driver.findElement(By.cssSelector("input#password"));
		Actions action=new Actions(driver);
		action.doubleClick(DoubleClick).perform();
		Thread.sleep(2000);
		
		driver.close();
		
		
		
	
}
}
