package com.simpleannotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class STCMJava {
	
	
	@BeforeSuite
	private void browserlaunch() {
		System.out.println("browser launch");
		
	}

	@BeforeTest
	private void url() {
		System.out.println("Amazon url");
	}
	
	@BeforeClass
	private void login() {
		System.out.println("Amazon Login");
	}
	@BeforeMethod
	private void search() {
		System.out.println("Iphone");
	}
	
	@Test
	private void buy() {
		System.out.println("Iphone added to cart");
	}
	
	@AfterMethod
	private void bought() {
		System.out.println("Iphone purchased");
	}
	
	@AfterClass
	private void logout() {
		System.out.println("logged out");
	}
	@AfterTest
	private void urlclose() {
		System.out.println("URL closed");
	
	}
	@AfterSuite
	private void browserclose() {
		System.out.println("browser closed");
	}
}
