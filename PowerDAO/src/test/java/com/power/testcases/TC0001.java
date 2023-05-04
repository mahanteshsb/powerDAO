package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.DownloadPage;
import com.power.qa.pages.FeaturesPage;
import com.power.qa.pages.LoginPage;
import com.power.qa.pages.PricingPage;
import com.power.qa.pages.ResourcesPage;
import com.power.qa.pages.homePage;



public class TC0001 extends TestBase {

	@Test
public void verify_domainRegistrationDate() throws InterruptedException {
		homePage home=new homePage(getDriver());
		
		home.launch();
	}
	@Test(priority = 1)
	public void verify_Pricing() throws InterruptedException {
		PricingPage pricing=new PricingPage(getDriver());
		pricing.pricingTest();
		
	}
//	@Test(priority = 5)
//	public void verify_Plan() {
//		PricingPage plan=new PricingPage(getDriver());
//		plan.planTest();
//	}
//	
	@Test(priority = 5)
	public void verify_Download() {
		
		DownloadPage downloadpage=new DownloadPage(getDriver());
		downloadpage.downloadTest();
		
	}
	@Test(priority = 2)
	public void verify_Feature() {
		FeaturesPage featurepage=new FeaturesPage(getDriver());
		featurepage.featureTest();
		
	}
	@Test(priority = 3)
	public void verify_ResourcesPage() {
		ResourcesPage resources=new ResourcesPage(getDriver());
		resources.resourcesTest();
	}
	@Test(priority = 4)
	
	public void verify_LoginPage() {
		LoginPage page=new LoginPage(getDriver());
		page.loginTest();
	}

}
