package com.training;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Training {

	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();
		
		 driver.get("https://www.google.com/");
		 
		 WebElement search = driver.findElement(By.name("q"));
		 search.sendKeys("Prasad Balasubramanian");
		 search.submit();
		 
		 
	}
}
