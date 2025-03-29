package com.pojorunner;

import java.sql.Driver;

import org.openqa.selenium.TakesScreenshot;

import com.pojoclass.Pojoclass;

public class pojorunner {
	
	public static void main(String[] args) {
		
		Pojoclass p= new Pojoclass();
		
		System.out.println(p.geta());
		p.seta("Prasad Balasubramanian");
		System.out.println(p.geta());
		
			
	}

}
