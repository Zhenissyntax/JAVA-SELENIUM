package com.class11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.CommonMethods;

public class SelectCalendar extends CommonMethods {
public static void main(String[] args) {
	CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/");
	driver.findElement(By.xpath("//a[text()='Form']")).click();
	driver.findElement(By.cssSelector("input#datepicker")).click();
	WebElement month=driver.findElement(By.cssSelector("select.ui-datepicker-month"));
	Select obj= new Select(month);
	obj.selectByValue("7"); // value less -1 of month number because by index
	WebElement year=driver.findElement(By.cssSelector("select.ui-datepicker-year"));
	Select obj2=new Select(year);
	obj2.selectByValue("1990");
	String expected="25";
	List<WebElement> day=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
	for(WebElement el:day) {
		String elText=el.getText();
		if(elText.equalsIgnoreCase(expected)) {
			el.click();
			
		}
	}
}
}
