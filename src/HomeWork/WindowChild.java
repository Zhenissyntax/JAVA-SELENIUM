package HomeWork;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import utils.CommonMethods;
public class WindowChild extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        CommonMethods.setUpDriver("chrome", "https://the-internet.herokuapp.com/");
        Thread.sleep(2000);
        String parent = driver.getTitle();
        String parentId = driver.getWindowHandle();
        System.out.println("title: " + parent + " Parent id: " + parentId);
        driver.findElement(By.linkText("Multiple Windows")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Elemental Selenium")).click();
        Set<String> allWindow = driver.getWindowHandles();
        Iterator<String> it = allWindow.iterator();
        parent = it.next();
        String child = it.next();
        driver.switchTo().window(child);
        child = driver.getTitle();
        System.out.println("title: " + child);
        driver.close();
        driver.switchTo().window(parent);
        driver.findElement(By.linkText("Click Here")).click();
        Set<String> allWindoww = driver.getWindowHandles();
        Iterator<String> it2 = allWindoww.iterator();
        String parent2 = it2.next();
        String child2 = it2.next();
        driver.switchTo().window(child2);
        child2 = driver.getTitle();
        System.out.println(child2);
        driver.close();
        
        driver.switchTo().window(parent);
        String child3 = driver.getTitle();
        System.out.println(child3);
        driver.quit();
        
        
    }
}