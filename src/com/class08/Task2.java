package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class Task2 extends CommonMethods{
public static void main(String[] args) throws InterruptedException {
	CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Index");
	WebElement act=driver.findElement(By.xpath("//a[text()='Actions']"));
	act.click();
	WebElement dragg=driver.findElement(By.cssSelector("div#draggable"));
	WebElement dropp=driver.findElement(By.cssSelector("div#droppable"));
	Actions action=new Actions(driver);
	action.dragAndDrop(dragg, dropp).perform();
	Thread.sleep(3000);
	driver.close();
	
	
	
}
}
