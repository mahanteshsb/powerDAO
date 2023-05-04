package com.power.qa.settings;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.power.qa.base.TestBase;
import com.power.qa.pages.BasePage;
import com.power.qa.util.Helpers;

public class You extends BasePage{

	protected You(WebDriver driver) {
		super(TestBase.getDriver());

		
	
	}
	
	Helpers helper=new Helpers();


	public void Youpage() {
		 JavascriptExecutor jse=(JavascriptExecutor) driver;
	}
	
	
}
