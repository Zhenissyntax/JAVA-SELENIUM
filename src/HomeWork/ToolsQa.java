package HomeWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsQa {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zhenis\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("John");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Smith");
		WebElement maleRadio= driver.findElement(By.cssSelector("input#sex-0"));
		System.out.println("male button is enable: "+maleRadio.isEnabled());
		maleRadio.click();
		System.out.println("Male Button is selected: "+maleRadio.isSelected());
		System.out.println("------------------------------------------------------");
		
		List<WebElement>experience = driver.findElements(By.name("exp"));
		System.out.println(experience.size()+" ChechBoxes");
		for (WebElement yr:experience) {
			if (yr.isEnabled()) {
				yr.click();
			System.out.println("radiobutton is clickable");
			
		}else {
			System.out.println("radiobutton is NOT clickable");
		}
		}
		
		System.out.println("-----------------------------------------------");
		driver.findElement(By.cssSelector("input#datepicker")).sendKeys("5/18/2019");
		System.out.println("--------------------------------------");
		String valueToSelect = "Tester";
		List<WebElement> professionList = driver.findElements(By.name("profession"));

		System.out.println(professionList.size());

		for (WebElement profession : professionList) {
			
			
				
				String value = profession.getAttribute("value");
				System.out.println(value);
				
				if (value.contains(valueToSelect)) {
					profession.click();
				}
			}
		String sel="Selenium IDE";
		String sel2="QTP";
		List<WebElement>ToolList=driver.findElements(By.name("tool"));
		System.out.println("Total of tools: "+ToolList.size());
		for(WebElement tool:ToolList){
			if(tool.isEnabled()) {
				tool.click();
				Thread.sleep(2000);
				System.out.println("Tool Check box is clickable");
			}else {
				System.out.println("Tool Check box is NOT clickable");
				
				Thread.sleep(2000);
			}
			String value=tool.getAttribute("value");
			if(value.equals(sel)) {
				driver.findElement(By.cssSelector("input#tool-0")).click();
			}else if(value.equals(sel2)) {
				driver.findElement(By.cssSelector("input#tool-1")).click();
			}
			WebElement selectedTool=driver.findElement(By.cssSelector("input#tool-2"));
			System.out.println("Web DriverTool is Selected: "+selectedTool.isSelected());
		}
	
	Thread.sleep(5000);
		driver.quit();
		
		
	}
}
