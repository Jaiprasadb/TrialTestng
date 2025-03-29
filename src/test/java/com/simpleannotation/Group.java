package com.simpleannotation;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Group {

	
	@Test(priority = -1, groups = "Laptop", dependsOnGroups = "Mobile")
	private void Lenovo() {
		System.out.println("Lenovo Loq");
	}
	
	@Test(priority = 0, groups = "Laptop", dependsOnGroups = "Mobile")
	private void hp() {
		System.out.println("hp victus");
	}
	@Test(priority = 1, groups = "Laptop", dependsOnGroups = "Mobile")
	private void dell() {
		System.out.println("Dell8");
	}
	
	@Ignore 
	private void Iphone() {
		System.out.println("Iphone");
}
	@Test (groups = "Mobile")
	private void samsung() {
		// TODO Auto-generated method stub
System.out.println("S24");
	}
	@Test (groups = "Mobile")
	private void nokia() {
		// TODO Auto-generated method stub
System.out.println("3310");
	}
	@Test (groups = "Mobile")
	private void google() {
		// TODO Auto-generated method stub
System.out.println("pixel");
	}
}