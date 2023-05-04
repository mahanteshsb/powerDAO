package com.power.settingstestcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.settings.PrivecyandSecurity;
import com.power.qa.settings.SettingHomePage;
import com.power.qa.settings.YouandChrome;

public class TC01 extends TestBase {

//	@Test
//	public void verify_SettingPage() {
////		SettingHomePage ss=new SettingHomePage(getDriver());
////		ss.launch();
//
//		YouandChrome cm = new YouandChrome(getDriver());
//		cm.verify_YouandChromePage();
//	}

	@Test
	public void verify_PrivecyandSecurity() throws InterruptedException {
		PrivecyandSecurity ps = new PrivecyandSecurity(getDriver());
		ps.Test_PrivecyandSecurity();

	}
}
