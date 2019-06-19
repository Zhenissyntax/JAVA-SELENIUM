package com.class12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.CommonMethods;

public class FlightSearch extends CommonMethods {
	
	
 @BeforeMethod
 public void setUp() {
	 setUpDriver("chrome","https://www.aa.com/homePage.do");
 }
 
 @Test
 public void searchFlight() throws InterruptedException {
	 //enter to and from
	 sendText(driver.findElement(By.name("originAirport")),"DCA");
	 sendText(driver.findElement(By.name("destinationAirport")),"JFK");
	 

		driver.findElement(By.xpath("//input[@id='aa-leavingOn']//following-sibling::button")).click();

		WebElement depMonth = driver.findElement(By.xpath("//div[contains(@class,'ui-corner-left')]/div"));
		while (!depMonth.getText().contains("October")) {
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			depMonth = driver.findElement(By.xpath("//div[contains(@class,'ui-corner-left')]/div"));

		}
		List<WebElement> depCells = driver.findElements(By.xpath("//div[contains(@class,'group-first')]/table/tbody/tr/td"));
		for (WebElement cell : depCells) {
			if (cell.getText().equals("18")) {
				cell.click();
				break;

			}
		}
		driver.findElement(By.cssSelector("input#aa-returningFrom")).click();
		WebElement retr=driver.findElement(By.xpath("//div[contains(@class,'ui-datepicker-group ui-datepicker-group-last')]/div"));
		
		while(!retr.getText().contains("December")) {
			driver.findElement(By.xpath("//a[@data-event='click']")).click();
			retr=driver.findElement(By.xpath("//div[contains(@class,'ui-datepicker-group ui-datepicker-group-last')]/div"));

			
		}
		List<WebElement>retrCells=driver.findElements(By.xpath("//div[contains(@class,'group-first')]/table/tbody/tr/td"));
		for(WebElement cell2:retrCells) {
			if(cell2.getText().equals("25")) {
				cell2.click();
				break;
			}
		}
		Thread.sleep(3000);
	}
 
 @AfterMethod
 public void tearDown() {
	 driver.quit();
 }
}
