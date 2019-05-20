
package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zhenis\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://syntaxtechs.com");
		Thread.sleep(2000);
		driver.navigate().to("http://google.com");
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().refresh();
		String title=driver.getTitle();
		
		if(title.contains("Syntax")) {
			System.out.println("This is the right TITLE");
		}else {
			System.out.println("This is the WRONG TITLE");
		}
		driver.close();
	}
}