package com.class12;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import utils.CommonMethods;

public class ScreenSHot extends CommonMethods {
public static void main(String[] args) {
CommonMethods.setUpDriver("chrome", "https://google.com");
TakesScreenshot ts=(TakesScreenshot)driver;
File scr=ts.getScreenshotAs(OutputType.FILE);

try {
	FileUtils.copyFile(scr, new File("screenshots/Google/Google.png"));
} catch (IOException e) {
	e.printStackTrace();
	System.out.println("Unable to take screesnhot");
}
	
}
}
