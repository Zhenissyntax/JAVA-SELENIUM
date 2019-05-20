package com.class06;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonTask {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Zhenis\\\\Selenium\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://amazon.com/");
	WebElement departments= driver.findElement(By.cssSelector("select[name='url']"));
	Select select=new Select(departments);
	List<WebElement>allOptions=select.getOptions();
	System.out.println("Number of All options in Departmen is: "+allOptions.size());
	System.out.println("-----------------------");
	System.out.println("------ all options from DEPARTMENTS dd-------");
	Iterator<WebElement> it=allOptions.iterator();
	while(it.hasNext()) {
		String optionText=it.next().getText();
		System.out.println(optionText);
	}
	 System.out.println("------------------------");
	 
	 select.selectByVisibleText("Computers");

	 Thread.sleep(4000);
	 driver.quit();
	
	
}
}
