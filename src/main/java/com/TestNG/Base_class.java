package com.TestNG;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_class {

	static WebDriver driver;
	
	public static void browserlaunch() {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();


	}
	
	public static void url(String u) {
		driver.get(u);
	}
	
	public static void screenshot(String s) throws IOException {
		
		TakesScreenshot t = (TakesScreenshot) driver;
		File screenshotAs = t.getScreenshotAs(OutputType.FILE);
		File scr = new File("C:\\Users\\Prasad\\eclipse-workspace\\TestNG\\target\\"+s);
		org.openqa.selenium.io.FileHandler.copy(screenshotAs, scr);
	}
	
}
