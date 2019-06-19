package com.class11;


import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;
public class HomeWorkTask2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        setUpDriver("chrome", "http://uitestpractice.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Form")).click();
        sendText(driver.findElement(By.cssSelector("input#firstname")), "John");
        sendText(driver.findElement(By.cssSelector("input#lastname")), "Smith");
        WebElement radio = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/form/div[3]/label[3]/input"));
        radio.isEnabled();
        radio.click();
        List<WebElement> professionList = driver.findElements(By.xpath("//input[@value='read']"));
        for (WebElement profession : professionList) {
            if (profession.isEnabled()) {
                profession.click();
            }
        }
        selectValueFromDD(driver.findElement(By.cssSelector("select#sel1")), "Angola");
        driver.findElement(By.cssSelector("input#datepicker")).click();
        WebElement month = driver.findElement(By.cssSelector("select.ui-datepicker-month"));
        Select obj = new Select(month);
        obj.selectByValue("5");
        Thread.sleep(3000);
        WebElement year = driver.findElement(By.cssSelector("select.ui-datepicker-year"));
        Select obj2 = new Select(year);
        obj2.selectByValue("1997");
        String expected = "9";
        List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement data : dates) {
            String dateText = data.getText();
            if (dateText.equalsIgnoreCase(expected)) {
                data.click();
            }
        }
        sendText(driver.findElement(By.cssSelector("input#phonenumber")), "1235465");
        sendText(driver.findElement(By.cssSelector("input#username")), "JOhn");
        sendText(driver.findElement(By.cssSelector("input#email")), "smith4564@gmai.com");
        sendText(driver.findElement(By.cssSelector("textarea#comment")), "I am a TECH !");
        sendText(driver.findElement(By.cssSelector("input#pwd")), "john123456");
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
        driver.quit();
    }
}