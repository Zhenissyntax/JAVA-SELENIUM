package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class HomeWorkForm extends CommonMethods{
	public static void main(String[] args) {
		String url="http://uitestpractice.com/";
		CommonMethods.setUpDriver("chrome", url);
		driver.findElement(By.xpath("//a[@href='/Students/Form']")).click();
		driver.findElement(By.cssSelector("input#firstname")).sendKeys("James");
		driver.findElement(By.cssSelector("input#lastname")).sendKeys("Thompson");
		
		
		
	}

}
