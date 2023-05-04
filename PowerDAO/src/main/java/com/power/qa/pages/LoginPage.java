package com.power.qa.pages;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import com.power.qa.base.TestBase;
import com.power.qa.util.Helpers;

import lombok.experimental.Helper;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(TestBase.getDriver());
	}
	
	Helpers helper=new Helpers();
	
	
	@FindBy(xpath = "//a[text()=' Login ']")
	WebElement Login;
	
	@FindBy(xpath = "//input[@id='amember-login']")
	WebElement username;
	
	@FindBy(xpath = "//input[@type='password']")
	WebElement password;
	
//	@FindBy(xpath = "/html/body/div[1]/div[3]/div/div[1]/div[2]/div[1]/div/form/fieldset/div[4]/div/input")
//	WebElement LoginButton;
//	
	public void loginTest() {
		helper.waitForPageToLoad();
		helper.highLightElement(driver, Login);
		helper.click(Login);
		Reporter.log("Page Title =" + driver.getTitle());
		helper.waitForPageToLoad();
		
		helper.waitFor(username);
		helper.highLightElement(driver, username);
	driver.findElement(By.xpath("//input[@id='amember-login']")).sendKeys("Maha");
     Reporter.log("Page Title =" + driver.getTitle());
     
     helper.waitFor(password);
     helper.highLightElement(driver, password);
 	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Maha");
 	Reporter.log("Page Title =" + driver.getTitle());
 	helper.waitForPageToLoad();
 	
 	driver.navigate().back();
 	helper.waitForPageToLoad();
 	
// 	helper.waitFor(Login);
// 	helper.highLightElement(driver, Login);
// 	helper.click(LoginButton);
// 	Reporter.log("Page Title =" + driver.getTitle());
// 	helper.waitForPageToLoad();
// 	

	}
}
