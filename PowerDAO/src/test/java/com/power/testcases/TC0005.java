package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.ResourcesPage;

public class TC0005 extends TestBase{
	
	@Test
	public void verify_ResourcesPage() {
		ResourcesPage resources=new ResourcesPage(getDriver());
		resources.resourcesTest();
	}

}
