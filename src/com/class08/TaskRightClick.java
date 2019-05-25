package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class TaskRightClick extends CommonMethods {
public static void main(String[] args) throws InterruptedException {
	CommonMethods.setUpDriver("chrome", "https://www.saucedemo.com/");
	WebElement RightClick=driver.findElement(By.cssSelector("input#password"));
	Actions action=new Actions(driver);
	action.contextClick(RightClick).perform();
	Thread.sleep(2000);
	driver.close();
	
}
}
