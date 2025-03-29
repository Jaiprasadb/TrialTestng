package com.testcase;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazontestcase {

	
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String Parentwindow = driver.getWindowHandle();
		System.out.println("parenwindow: " + Parentwindow);
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoes");
		search.submit();
		WebElement shoe = driver.findElement(By.xpath("//span[text()='EVA Lite Sport Shoes Running Shoes for Men- Blue']"));
		shoe.click();
		List list = new ArrayList<>(driver.getWindowHandles());
		System.out.println(list);
		System.out.println(list.get(1));
	    driver.switchTo().window((String) list.get(1));
	    
	   WebElement Quantity = driver.findElement(By.xpath("//span[text()='Quantity:']"));
	   Quantity.click();
	   WebElement q2 = driver.findElement(By.id("quantity_0"));
	   q2.click();
	   WebElement add = driver.findElement(By.name("submit.add-to-cart"));
	   add.click();
	   WebElement buy = driver.findElement(By.id("buy-now-button"));
	   buy.click();
	   
	   TakesScreenshot ts =  (TakesScreenshot) driver;
	   File scr = ts.getScreenshotAs(OutputType.FILE);
	   File dstFile = new File("C:\\Users\\Prasad\\eclipse-workspace\\TestNG\\target\\nothing.png");
	   FileHandler.copy(scr, dstFile);
	}
}
