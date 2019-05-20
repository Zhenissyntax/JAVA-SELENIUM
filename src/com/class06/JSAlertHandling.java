package com.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAlertHandling {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Zhenis\\\\Selenium\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
        driver.manage().window().maximize();
        // This step will result in an alert on screen
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='content']/p[4]/button")).click();
        
        Alert simpleAlert = driver.switchTo().alert();
        String alertText = simpleAlert.getText();
        System.out.println("Alert text is " + alertText);
        Thread.sleep(1000);
        simpleAlert.accept();
        Thread.sleep(2000);
        driver.close();
    }
}
