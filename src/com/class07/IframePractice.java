package com.class07;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class IframePractice extends CommonMethods {
public static void main(String[] args) throws InterruptedException {
	CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");
	driver.switchTo().frame("iframe_a");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input#name")).sendKeys("John");
	driver.switchTo().defaultContent();
	Thread.sleep(2000);
	driver.close();
	
	
	
}
}
