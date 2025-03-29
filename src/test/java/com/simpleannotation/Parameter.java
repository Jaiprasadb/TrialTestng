package com.simpleannotation;

import javax.swing.table.TableStringConverter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.json.StaticInitializerCoercer;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import okhttp3.Credentials;

public class Parameter {

	static WebDriver driver;
	
	@BeforeMethod
	private void facebook() {
		// TODO Auto-generated method stub

WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
		
	}
	
	@Test(dataProvider = "userdetails")
	
		
@Parameters({"a", "b"})
	private void Credentials(String a, String b) {
			driver.findElement(By.id("email")).sendKeys(a);
			driver.findElement(By.id("pass")).sendKeys(b);
	}
	
	@DataProvider
	private Object[][] userdetails(){
		return new Object[][] {
			
			{"Prasad","Pass@123"}
		};
		
		
		
	}
	
}
