package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.LoginPage;

public class TC0006 extends TestBase {
	
	@Test
	
	public void verify_LoginPage() {
		LoginPage page=new LoginPage(getDriver());
		page.loginTest();
	}

}
