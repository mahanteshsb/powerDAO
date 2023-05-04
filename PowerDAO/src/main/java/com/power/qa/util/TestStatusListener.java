package com.power.qa.util;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TestStatusListener implements ITestListener {
	/*(non -Javadoc)
	 * @see org.testing.ITestListener#onTestStart(org.testng.ITstResult)
	 */
	

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Mahantesh");
		Reporter.log("Mahantesh");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Mahantesh Trup[tai done");
		Reporter.log("Mahantesh Trup[tai done");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Mahantesh Trup[tai done");
		Reporter.log("Mahantesh Trup[tai done");
		
	}

}
