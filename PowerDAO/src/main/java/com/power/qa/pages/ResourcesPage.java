package com.power.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import com.power.qa.base.TestBase;
import com.power.qa.util.Helpers;

public class ResourcesPage extends BasePage {

	public ResourcesPage(WebDriver driver) {
		super(TestBase.getDriver());
	
	}
Helpers helper=new Helpers();

@FindBy(xpath = "//a[text()='Resources']")
WebElement Resources;

@FindBy(xpath = "//a[text()='Blog']")
WebElement Blog;

@FindBy(xpath = "//*[@id=\"menu-item-8890\"]/a")
WebElement ReleaseNotes;

@FindBy(xpath = "//*[@id=\"menu-item-1393\"]/a")
WebElement download;

public void resourcesTest() {
	helper.waitForPageToLoad();
	helper.waitFor(Resources);
	helper.highLightElement(driver, Resources);
	helper.moveToElement(Resources);
	System.out.println("==============Test Report====================");
	Reporter.log("Page Title =" + driver.getTitle());
	helper.waitForPageToLoad();
	
	helper.waitFor(Blog);
	helper.highLightElement(driver, Blog);
	helper.click(Blog);
	Reporter.log("Page Title =" + driver.getTitle());
	helper.waitForPageToLoad();
	
	driver.navigate().back();
	helper.waitForPageToLoad();
	
	helper.waitFor(Resources);
	helper.highLightElement(driver, Resources);
	helper.moveToElement(Resources);
	Reporter.log("Page Title =" + driver.getTitle());
	helper.waitForPageToLoad();
	
	helper.waitFor(ReleaseNotes);
	helper.highLightElement(driver, ReleaseNotes);
	helper.click(ReleaseNotes);
	Reporter.log("Page Title =" + driver.getTitle());
	helper.waitForPageToLoad();
	
	driver.navigate().back();
	helper.waitForPageToLoad();
	
	helper.waitFor(Resources);
	helper.highLightElement(driver, Resources);
	helper.moveToElement(Resources);
	Reporter.log("Page Title =" + driver.getTitle());
	helper.waitForPageToLoad();
	
	helper.waitFor(download);
	helper.highLightElement(driver, download);
	helper.click(download);
	Reporter.log("Page Title =" + driver.getTitle());
	helper.waitForPageToLoad();
	
	driver.navigate().back();
	helper.waitForPageToLoad();
	
	
	
}
}
