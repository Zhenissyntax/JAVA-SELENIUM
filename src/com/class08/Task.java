package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class Task extends CommonMethods {
public static void main(String[] args) throws InterruptedException {
	CommonMethods.setUpDriver("chrome", "https://www.toolsqa.com/");
	WebElement h=driver.findElement(By.xpath("//span[text()='ABOUT']"));
	Actions action=new Actions(driver);
	action.moveToElement(h).click().perform();
	driver.findElement(By.xpath("//span[text()='About']")).click();
	Thread.sleep(2000);
	driver.close();
	
	

}
}
