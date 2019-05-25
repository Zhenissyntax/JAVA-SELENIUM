package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class AmazonWindow extends CommonMethods {
	public static void main(String[] args) {
		
	
	CommonMethods.setUpDriver("chrome", "https://www.amazon.com/");
	String Parent=driver.getTitle();
	String ParentID=driver.getWindowHandle();
	driver.findElement(By.id("iframe#ape_Gateway_right-2_desktop_iframe")).click();
	
	
	}
}
