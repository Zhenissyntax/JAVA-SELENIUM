package com.class06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zhenis\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://uitestpractice.com/");
		driver.findElement(By.linkText("Select")).click();
		WebElement countriesDD = driver.findElement(By.cssSelector("select#countriesSingle"));
		Select select = new Select(countriesDD);
		List<WebElement> Options = select.getOptions();
		System.out.println("Numbers of Countries: " + Options.size());
		select.selectByVisibleText("United states of America");

		WebElement mcountr = driver.findElement(By.cssSelector("select#countriesMultiple"));
		Select select1 = new Select(mcountr);
		List<WebElement> moptions = select.getOptions();
		System.out.println("Numbers of Multiple Select Countries: " + moptions.size());
		if (select1.isMultiple()) {
			select1.selectByIndex(0);
			select1.selectByIndex(1);
			select1.selectByIndex(2);
			select1.selectByIndex(3);
			Thread.sleep(2000);
			select1.deselectByIndex(2);

		}

		Thread.sleep(2000);
		driver.quit();
	}
}
