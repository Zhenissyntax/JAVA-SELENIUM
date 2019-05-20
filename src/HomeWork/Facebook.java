package HomeWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zhenis\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement months=driver.findElement(By.id("month"));
	Select objm=new Select(months);
	List<WebElement>allopt=objm.getOptions();
	int count=0;
	for(WebElement total:allopt) {
		String value=total.getAttribute("value");
		if(!value.equals("0")) {
			count++;
		}
			
	}
	System.out.println("Months : "+count);
	
	WebElement day=driver.findElement(By.id("day"));
	Select objd=new Select(day);
	List<WebElement>allopt2=objd.getOptions();
	int countd=0;
	for(WebElement total2:allopt2) {
		String value2=total2.getAttribute("value");
		if(!value2.equals("0")) {
			countd++;
		}
			
	}
	System.out.println("days: "+countd);
	
	WebElement year=driver.findElement(By.id("year"));
	Select objy=new Select(year);
	List<WebElement>allopt3=objy.getOptions();
	int countyear=0;
	for(WebElement total3:allopt3) {
		String value3=total3.getAttribute("value");
		if(!value3.equals("0")) {
			countyear++;
		}
			
	}
	System.out.println("years: "+countyear);
	
	
	}
	
	
	
	
	
}

