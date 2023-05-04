package com.power.qa.settings;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import com.power.qa.base.TestBase;
import com.power.qa.util.Helpers;

import lombok.experimental.Helper;

public class PrivecyandSecurity extends BasePage {

	public PrivecyandSecurity(WebDriver driver) {
		super(TestBase.getDriver());
		// TODO Auto-generated constructor stub
	}

	Helpers helper = new Helpers();

	public void Test_PrivecyandSecurity() throws InterruptedException {

		Reporter.log(" ");
		Reporter.log("<B><font color = 'BLUE'>  Test_PrivecyandSecurity  -</font>.");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement PrivecyandSecurity = (WebElement) jse.executeScript(
				"return document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#leftMenu\").shadowRoot.querySelector(\"#menu > a:nth-child(3)\")");
		helper.waitForPageToLoad();
		helper.highLightElement(driver, PrivecyandSecurity);
		jse.executeScript("arguments[0].click();", PrivecyandSecurity);
		// jse.executeAsyncScript("arguments[0].click();", PrivecyandSecurity);
		helper.waitForPageToLoad();
		Reporter.log("Title" + PrivecyandSecurity.getText());

		// Thread.sleep(2000);
		try {
			// JavascriptExecutor jse1 = (JavascriptExecutor) driver;
			WebElement checkNow = (WebElement) jse.executeScript(
					"return document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#main\").shadowRoot.querySelector(\"settings-basic-page\").shadowRoot.querySelector(\"#safetyCheckSettingsSection > settings-safety-check-page\").shadowRoot.querySelector(\"#safetyCheckParentButton\")");
			helper.highLightElement(driver, checkNow);
			jse.executeAsyncScript("arguments[0].click();", checkNow);
			// helper.jsCLick(checkNow);
//			helper.waitForPageToLoad();

			Reporter.log(checkNow.getTagName());
			helper.waitForPageToLoad();
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			WebElement Clear = (WebElement) jse.executeScript(
					"return document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#main\").shadowRoot.querySelector(\"settings-basic-page\").shadowRoot.querySelector(\"#basicPage > settings-section:nth-child(9) > settings-privacy-page\").shadowRoot.querySelector(\"#clearBrowsingData\").shadowRoot.querySelector(\"#label\")");
			helper.highLightElement(driver, Clear);
			helper.waitForPageToLoad();
			jse.executeScript("arguments[0].click();", Clear);
			Reporter.log(Clear.getTagName());
			helper.waitForPageToLoad();

//			 driver.navigate().back();
//			 helper.waitForPageToLoad();
		} catch (Exception e) {
			// TODO: handle exception
		}

		WebElement Uncheck = (WebElement) jse.executeScript(
				"return document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#main\").shadowRoot.querySelector(\"settings-basic-page\").shadowRoot.querySelector(\"#basicPage > settings-section:nth-child(9) > settings-privacy-page\").shadowRoot.querySelector(\"settings-clear-browsing-data-dialog\").shadowRoot.querySelector(\"#browsingCheckbox\").shadowRoot.querySelector(\"#checkbox\").shadowRoot.querySelector(\"#checkmark\")");
		helper.waitForPageToLoad();
		jse.executeScript("arguments[0].click();", Uncheck);
		Reporter.log(Uncheck.getTagName());
		helper.waitForPageToLoad();

	}

}
