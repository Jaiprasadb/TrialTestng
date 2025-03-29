package com.simpleannotation;

import java.security.PublicKey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.json.StaticInitializerCoercer;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Paralleltest {

	public static WebDriver driver;
	@Test
	private void facebook() {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
	}
	
	@Test
	
	private void facebook2() {
		// TODO Auto-generated method stub
WebDriverManager.iedriver().setup();
driver = new InternetExplorerDriver();
driver.get("https://www.facebook.com/");
	}
}
