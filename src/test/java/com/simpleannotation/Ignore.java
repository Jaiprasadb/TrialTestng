package com.simpleannotation;

import org.testng.annotations.Test;


public class Ignore {

	
	@Test (enabled = false)
	private void urllaunch() {
		System.out.println("Url Launch");
	}
	
	@Test (priority = 0)
	private void adpopup() {
		System.out.println("ad popup");
	}
	@Test (priority = 1)
	private void mobile() {
		System.out.println("selecting the mobile");
	}
	
	@Test (priority = 2)
	private void Iphone() {
		System.out.println("Iphone");
	}
	
	@org.testng.annotations.Ignore
	private void  ordercancel() {
		System.out.println("Cancel the order");
	}
}
