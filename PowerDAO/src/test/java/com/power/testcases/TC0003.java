package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.DownloadPage;

public class TC0003 extends TestBase{
	
	@Test
	public void verify_Download() {
		
		DownloadPage downloadpage=new DownloadPage(getDriver());
		downloadpage.downloadTest();
		
	}

}
