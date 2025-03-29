package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_class {

	
	WebDriver driver;
	
	
	@FindBy(id = "twotabsearchtextbox")
	private WebElement search;
	
	public Pom_class(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSearch() {
		return search;
	}
	
	
	
}
