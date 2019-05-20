
package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands{
	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zhenis\\Selenium\\chromedriver.exe");
		//	WebDriver driver=new ChromeDriver();
		 //   driver.get("http://google.com");
		 //   System.out.println(driver.getTitle());
		//    String title=driver.getTitle();
		 //   if(title.equalsIgnoreCase("google")) {
		  //  	System.out.println("This is the right title");
		 //   }else {
		    //	System.out.println("This is not the title");
		 //   }
		   
		    WebDriver driver2=new ChromeDriver();
		    driver2.get("http://facebook.com");
		    System.out.println(driver2.getTitle());
		    String title2=driver2.getTitle();
		    
		    if(title2.equalsIgnoreCase("Facebook - Log In or Sign Up")) {
		    	System.out.println("This is the right title");
		    }else {
		    	System.out.println("This is not the title");
		    } 
		
		
	}
	
	
}