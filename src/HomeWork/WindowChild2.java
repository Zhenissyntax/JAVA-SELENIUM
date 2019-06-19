package HomeWork;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class WindowChild2 extends CommonMethods {
public static void main(String[] args) throws InterruptedException {
	

	CommonMethods.setUpDriver("chrome", "https://the-internet.herokuapp.com/");
	

	driver.findElement(By.xpath("//a[@href='/windows']")).click();
	
	String parent=driver.getTitle();
	System.out.println(parent);
	String parentId=driver.getWindowHandle();
	System.out.println(parentId);
	driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
	Set<String>allwindow=driver.getWindowHandles();
	Iterator<String>it=allwindow.iterator();
	parent=it.next();
	String child=it.next();
	driver.switchTo().window(child);
	System.out.println(driver.getTitle());
	System.out.println(driver.getWindowHandles());
	driver.close();
	driver.switchTo().window(parent);
	driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
	Set<String>allwindow2=driver.getWindowHandles();
	Iterator<String>it2=allwindow2.iterator();
	parent=it2.next();
	String child2=it2.next();
	driver.switchTo().window(child2);
	System.out.println(driver.getTitle());
	System.out.println(driver.getWindowHandles());
	driver.switchTo().window(parent);
	driver.close();
	driver.switchTo().window(child2);
	driver.close();
	

	
}
}
