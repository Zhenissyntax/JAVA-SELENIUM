package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class Task2 extends CommonMethods {
public static void main(String[] args) {
	CommonMethods.setUpDriver("chrome", "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
	driver.findElement(By.cssSelector("#ctl00_MainContent_username")).sendKeys("Tester");
	driver.findElement(By.cssSelector("#ctl00_MainContent_password")).sendKeys("test");
	driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_login_button\"]")).click();
	List<WebElement> rows=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));
	List<WebElement> columns=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[2]"));
	String name="Susan McLaren";
	for (int i=1; i<=rows.size(); i++) {
		String rowText=driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr["+i+"]")).getText();
	
		if(rowText.contains(name)) {
		System.out.println("Contains name");
	
		}
	
	}
}
}
