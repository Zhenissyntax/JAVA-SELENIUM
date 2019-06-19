package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class Task3 extends CommonMethods{
	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Index");
		WebElement act=driver.findElement(By.xpath("//a[text()='Actions']"));
		act.click();
		Actions action=new Actions(driver);
		action.clickAndHold(driver.findElement(By.xpath("//li[text()='1']"))).release().perform();
		action.clickAndHold(driver.findElement(By.xpath("//li[text()='2']"))).release().perform();
		action.clickAndHold(driver.findElement(By.xpath("//li[text()='3']"))).release().perform();
		action.clickAndHold(driver.findElement(By.xpath("//li[text()='4']"))).release().perform();
		Thread.sleep(3000);
		driver.close();


		
	}

}
