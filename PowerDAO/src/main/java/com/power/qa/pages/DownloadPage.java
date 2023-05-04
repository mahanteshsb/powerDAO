package com.power.qa.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import com.power.qa.base.TestBase;
import com.power.qa.util.Helpers;

public class DownloadPage extends BasePage{

	public DownloadPage(WebDriver driver) {
		super(TestBase.getDriver());
	
	}
Helpers helper=new Helpers();

@FindBy(xpath = "(//a[text()='Download Socinator'])[2]")
WebElement download;

@FindBy(xpath = "//input[@placeholder='Enter Name']")
WebElement name;

@FindBy(xpath = "//input[@placeholder='Enter Email address']")
WebElement Email;

@FindBy(xpath = "//input[@type='submit']")
WebElement DownloadSocinator;


@FindBy(xpath = "//div[@class='wpcf7-response-output']")
WebElement DownloadSocinator_Messgae;


public void downloadTest() {
	helper.waitForPageToLoad();
	helper.waitFor(download);
	helper.highLightElement(driver, download);
	helper.click(download);
	Reporter.log("Page Title" +driver.getTitle());
	helper.waitForPageToLoad();
	
	helper.waitFor(name);
	helper.highLightElement(driver, name);
	name.sendKeys("Mahantesh");
	Reporter.log("Page Title =" + driver.getTitle());
	helper.waitForPageToLoad();
	
	helper.waitFor(Email);
	Email.sendKeys("mahanteshsb@globussoft.in");
	helper.highLightElement(driver, Email);
	helper.waitFor(Email);
	Reporter.log("Page Title =" + driver.getTitle());
	helper.waitForPageToLoad();
	
	helper.waitFor(DownloadSocinator);
	helper.highLightElement(driver, DownloadSocinator);
	helper.click(DownloadSocinator);
	Reporter.log("Page Title =" + driver.getTitle());
	helper.waitForPageToLoad();

	helper.waitFor(DownloadSocinator_Messgae);
	helper.highLightElement(driver, DownloadSocinator_Messgae);
	String actualText = DownloadSocinator_Messgae.getText();
	assertEquals(actualText, "The download link has been sent to this email address. Please check your inbox or spam folder, it may take a few moments.");
	Reporter.log("The download link has been sent to this email address. Please check your inbox or spam folder, it may take a few moments. =" + actualText);
	helper.waitForPageToLoad();


}
}
