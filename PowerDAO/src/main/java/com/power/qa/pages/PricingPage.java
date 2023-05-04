package com.power.qa.pages;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import com.power.qa.base.TestBase;
import com.power.qa.util.Helpers;



public class PricingPage  extends BasePage {

	public PricingPage(WebDriver driver) {
		super(TestBase.getDriver());
		
	}
	Helpers helper=new Helpers();
	
			 
	
	@FindBy(xpath = "//a[text()='Pricing']")
	WebElement pricing;
	
	@FindBy(xpath = "(//a[contains(@data-tooltip-content,'Activate  Now!')])[6]")
	WebElement plan;
	
	@FindBy(xpath = "//input[@id='productOption[47-76][0][Select Accounts Package]---2']")
	WebElement Package;
	
	@FindBy(xpath = "//input[@id='name_f-0']")
	WebElement FirstName;
	
	@FindBy(xpath = "//input[@id='name_l-0']")
	WebElement LastName;
	
	@FindBy(xpath = "//input[@id='email-0']")
	WebElement EmailId;
	
	@FindBy(xpath = "//input[@name='phone']")
	WebElement PhoneNo;
	
	@FindBy(xpath = "//input[@placeholder='Choose a Username']")
	WebElement ChooseUsername;
	
	@FindBy(xpath = "//input[@placeholder='Choose a Password']")
	WebElement Password;
	
	@FindBy(xpath = "//input[@id='pass-confirm']")
	WebElement ConfirmPassword;
	
	@FindBy(xpath = "//input[@placeholder='Street']")
	WebElement Street;
	
	@FindBy(xpath = "//input[@placeholder='City']")
	WebElement City;
	
	@FindBy(xpath = "//Select[@name='country']")
	WebElement Country;
	
	@FindBy(xpath = "//input[@id='t_state']")
	WebElement State;
	
	@FindBy(xpath = "//input[@id='zip-0']")
	WebElement Zip;
	
	@FindBy(xpath = "//input[@id='_i_agree-page-0-0-0']")
	WebElement Button;
	
	@FindBy(xpath = "//input[@name='_qf_page-0_next']")
	WebElement Next;
	
	@FindBy(xpath = "(//input[@name=\"paysys_id\"])[1]")
	WebElement Payment;
	
	@FindBy(xpath = "//select[@id='f_state']")
	WebElement States;
	
	public void pricingTest() {
		
		System.out.println("======================Test Report=====================");
		helper.waitForPageToLoad();
		helper.highLightElement(driver, pricing);
		helper.click(pricing);
		Reporter.log(driver.getTitle());
		String actual=driver.getTitle();
		String Expected="The Best Plans And Pricing For You";
	
	Assert.assertEquals(actual, Expected, Expected);
		helper.waitForPageToLoad();
		
		driver.navigate().back();
		helper.waitForPageToLoad();
	}
 
/*	public void planTest() throws InterruptedException {
		
		helper.waitForPageToLoad();
		helper.highLightElement(driver, pricing);
		helper.click(pricing);
		Reporter.log(pricing.getText());
		helper.waitForPageToLoad();
		
		helper.waitFor(plan);
		helper.highLightElement(driver, plan);
		try{
			helper.click(plan);
		}catch (Exception e) {
			helper.jsCLick(plan);
		}
		helper.waitForPageToLoad();
		
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
	      //switch to new tab
	      driver.switchTo().window(newTb.get(1));
	      Reporter.log(driver.getTitle());
	      
	      helper.waitFor(Package);
	      helper.highLightElement(driver, Package);
	      helper.click(Package);
	    //  Reporter.log(Package.getText());
	      helper.waitForPageToLoad();
	      
	      helper.waitFor(Payment);
	      helper.highLightElement(driver, Payment);
	      helper.click(Payment);
	     // Reporter.log(Payment.getText());
	      helper.waitForPageToLoad();
	      
	      helper.waitFor(FirstName);
	      helper.highLightElement(driver, FirstName);
	      FirstName.sendKeys("Mahantesh");
	     // Reporter.log(FirstName.getText());
	      helper.waitForPageToLoad();
	      
	      helper.waitFor(LastName);
	      helper.highLightElement(driver, LastName);
	      LastName.sendKeys("S B");
	      //Reporter.log(LastName.getText());
	      helper.waitForPageToLoad();
	      
	      helper.waitFor(EmailId);
	      helper.highLightElement(driver, EmailId);
	      EmailId.sendKeys("truptimayeebehera@globussoft.in");
	     // Reporter.log(EmailId.getText());
	      helper.waitForPageToLoad();
	      
	      helper.waitFor(PhoneNo);
	      helper.highLightElement(driver, PhoneNo);
	      PhoneNo.sendKeys("1234567891");
	      //Reporter.log(PhoneNo.getText());
	      helper.waitForPageToLoad();
	      
	      
	      helper.waitFor(ChooseUsername);
	      helper.highLightElement(driver, ChooseUsername);
	      ChooseUsername.sendKeys("Maha_Gblobussoft12");
	      //Reporter.log(ChooseUsername.getText());
	      helper.waitForPageToLoad();
	      
	      helper.waitFor(Password);
	      helper.highLightElement(driver, Password);
	      Password.sendKeys("Maha_Gblobussoft12");
	   //   Reporter.log(Password.getText());
	      helper.waitForPageToLoad();
	      
	      helper.waitFor(ConfirmPassword);
	      helper.highLightElement(driver, ConfirmPassword);
	      ConfirmPassword.sendKeys("Maha_Gblobussoft12");
	    //  Reporter.log(ConfirmPassword.getText());
	      helper.waitForPageToLoad();
	      
	      helper.waitFor(Street);
	      helper.highLightElement(driver, Street);
	      Street.sendKeys("9th Main");
	    //  Reporter.log(Street.getText());
	      helper.waitForPageToLoad();
	      
	      helper.waitFor(City);
	      helper.highLightElement(driver, City);
	      City.sendKeys("Hubli");
	    //  Reporter.log(City.getText());
	      helper.waitForPageToLoad();
	     

	      helper.waitFor(Country);
	      helper.highLightElement(driver, Country);
	      helper.SelectDropdownValue(Country, "India");
	     // Reporter.log(Country.getText());
	      helper.waitForPageToLoad();
	      
	      helper.waitFor(States);
	      helper.highLightElement(driver, States);
	      helper.SelectDropdownValue(States, "Karnataka");
	    //  Reporter.log(States.getText());
//	      helper.waitFor(State);
//	      helper.highLightElement(driver, State);
//	      State.sendKeys("Hubli");
//	      Reporter.log("Message =" + driver.getTitle());
//	      helper.waitForPageToLoad();
//	      
	      helper.waitFor(Zip);
	      helper.highLightElement(driver, Zip);
	      Zip.sendKeys("Hubli");
	    //  Reporter.log(Zip.getText());
	      helper.waitForPageToLoad();
	      
	      helper.waitFor(Button);
	      helper.click(Button);
	    //  Reporter.log(Button.getText());
	      helper.waitForPageToLoad();
	      
	      helper.waitFor(Next);
	      helper.highLightElement(driver, Next);
	     helper.click(Next);
	      Reporter.log("Message =" + driver.getTitle());
	      helper.waitForPageToLoad();
	}*/
}
