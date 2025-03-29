package com.simpleannotation;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.support.ui.Sleeper;

import com.TestNG.Base_class;

public class Baserunner extends Base_class {

	public static void main(String[] args) throws IOException {
		
		browserlaunch();
	
				
		url("https://www.facebook.com/");
		screenshot("fb.png");
		url("https://www.instagram.com/p/BmbSQWKBVKl/");
		screenshot("insta.png");
		
	}

	
	


		
	

	
		
	}

