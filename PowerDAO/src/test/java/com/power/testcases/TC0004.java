package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.FeaturesPage;

public class TC0004 extends TestBase {

	@Test
	public void verify_Feature() {
		FeaturesPage featurepage=new FeaturesPage(getDriver());
		featurepage.featureTest();
		
	}
	
	
}
