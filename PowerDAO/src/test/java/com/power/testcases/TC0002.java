package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.PricingPage;
import com.power.qa.pages.ResourcesPage;

public class TC0002 extends TestBase{
	
	@Test(priority = 1)
	public void verify_Pricing() throws InterruptedException {
		PricingPage pricing=new PricingPage(getDriver());
		pricing.pricingTest();
		
	}
//@Test
//public void verify_Plan() throws InterruptedException {
//	PricingPage plan=new PricingPage(getDriver());
//	plan.planTest();
//}

@Test(priority = 2)
public void verify_ResourcesPage() {
	ResourcesPage resources=new ResourcesPage(getDriver());
	resources.resourcesTest();
}
}
