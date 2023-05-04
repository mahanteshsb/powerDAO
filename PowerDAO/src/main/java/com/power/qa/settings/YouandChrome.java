package com.power.qa.settings;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.power.qa.base.TestBase;
import com.power.qa.util.Helpers;

public class YouandChrome extends BasePage{

	public YouandChrome(WebDriver driver) {
		super(TestBase.getDriver());
		
	}
	Helpers helper=new Helpers();
	
	public void verify_YouandChromePage() {
	try {
		  Reporter.log(" ");
	      Reporter.log(" ");
		   JavascriptExecutor jse=(JavascriptExecutor) driver;
	
		   WebElement YouandChrome=(WebElement) jse.executeScript(
			          "return document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#leftMenu\").shadowRoot.querySelector(\"#people\")");
		      helper.highLightElement(driver, YouandChrome);
		      helper.waitForPageToLoad();
		      
		      Reporter.log("<B><font color = 'GREEN'>  ImportSetting  -</font>.");
			   WebElement ImportSetting=(WebElement) jse.executeScript(
				          "return document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#main\").shadowRoot.querySelector(\"settings-basic-page\").shadowRoot.querySelector(\"#basicPage > settings-section:nth-child(2) > settings-people-page\").shadowRoot.querySelector(\"#importDataDialogTrigger\").shadowRoot.querySelector(\"#label\")");
			      helper.highLightElement(driver, ImportSetting);
			      ImportSetting.click();
			      helper.waitForPageToLoad();
			      System.out.println(ImportSetting.getText());
			      
//			      Select sl=new Select(driver.findElement(By.id("browserSelect")));
//			      sl.selectByVisibleText("\r\n"
//			      		+ "                Microsoft Internet Explorer\r\n"
//			      		+ "              ");
			      try {
			    	  
			      
			      Reporter.log("<B><font color = 'GREEN'>  CheckBox  -</font>.");
			      WebElement CheckBox=(WebElement) jse.executeScript("return document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#main\").shadowRoot.querySelector(\"settings-basic-page\").shadowRoot.querySelector(\"#basicPage > settings-section:nth-child(2) > settings-people-page\").shadowRoot.querySelector(\"settings-import-data-dialog\").shadowRoot.querySelector(\"#importDialogHistory\").shadowRoot.querySelector(\"#checkbox\").shadowRoot.querySelector(\"#checkmark > path\")");
			    helper.highLightElement(driver, CheckBox);
			    CheckBox.click();
			    helper.waitForPageToLoad();
			    Reporter.log(CheckBox.getText());
			      }catch (Exception e) {
					// TODO: handle exception
				}
			     
			      try {
			    	  
			      
			    helper.waitForPageToLoad();
			      Reporter.log("<B><font color = 'GREEN'>  ImportButton  -</font>.");
			      WebElement ImportButton=(WebElement) jse.executeScript("return document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#main\").shadowRoot.querySelector(\"settings-basic-page\").shadowRoot.querySelector(\"#basicPage > settings-section:nth-child(2) > settings-people-page\").shadowRoot.querySelector(\"settings-import-data-dialog\").shadowRoot.querySelector(\"#import\")");
			      helper.highLightElement(driver, ImportButton);
			      ImportButton.click();
			      Reporter.log(ImportButton.getText());
			      helper.waitForPageToLoad();
			      System.out.println("---------ImportButton----------");
			      }catch (Exception e) {
					// TODO: handle exception
				}
			 
		
	} catch (Exception e) {
		// TODO: handle exception
	}
			 
		
	}
}
