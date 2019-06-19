package com.class10;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class WebTableTask extends CommonMethods {
public static void main(String[] args) {
	CommonMethods.setUpDriver("chrome", "https://the-internet.herokuapp.com/");
	driver.findElement(By.xpath("//a[@href='/tables']")).click();
	List <WebElement> columns= driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
	List <WebElement> rows=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
	System.out.println("Columns: "+columns.size());
	System.out.println("Rows: "+rows.size());
}
}
