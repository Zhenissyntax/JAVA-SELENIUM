package com.class05;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLinks {
public static void main(String[] args) {
	int count=0;
	System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\Zhenis\\\\\\\\Selenium\\\\\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().fullscreen();
	driver.get("https://www.amazon.com/");
	List <WebElement> links=driver.findElements(By.tagName("a"));
	Iterator<WebElement>iterator=links.iterator();
	while(iterator.hasNext()) {
	WebElement l=iterator.next();
	String LText=l.getText();
	if (!LText.isEmpty()) {
		System.out.println(LText);
		count++;
	}
	System.out.println("Total of NOT empty links :"+count);
	}
	
	
}
}
