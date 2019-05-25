package HomeWork;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zhenis\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://uitestpractice.com/Students/Switchto");
	driver.findElement(By.cssSelector("button#alert")).click();
	Alert alert=driver.switchTo().alert();
	Thread.sleep(3000);
	alert.accept();
	driver.findElement(By.xpath("//button[starts-with(text(),'Confirm')]")).click();
	Alert confirm2=driver.switchTo().alert();
	Thread.sleep(3000);
	confirm2.accept();
	
	
	
	
}
}
