package com.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Zhenis\\\\Selenium\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().fullscreen();
	driver.get("https://www.toolsqa.com/automation-practice-form/");
	String yearstoselect="4";
		
	List<WebElement>experience = driver.findElements(By.name("exp"));
	System.out.println(experience.size());
	for (WebElement yr:experience) {
		if (yr.isEnabled()) {
			yr.click();
		System.out.println("All radiobuttons are clickable");
		
	}else {
		System.out.println("Not all radiobuttons are clickable");
	}
	
	
}
}
}
