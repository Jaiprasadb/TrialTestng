package com.pomrunner;

import java.awt.Dimension;
import java.awt.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pomclass.Pom_class;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Pomrunner {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		Pom_class p = new Pom_class(driver);
		
		WebElement search = p.getSearch();
		search.sendKeys("mobiles");
		
		driver.manage().window().maximize();
		Dimension dimension = new Dimension(500, 500);
	//	driver.manage().window().setSize(dimension);
		Point point = new Point(250, 250);
			
	}
}
