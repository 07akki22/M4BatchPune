package com.crm.listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class VTigerListners implements ITestListener {
	public static ExtentSparkReporter spark;
	public static ExtentReports report;
	public static ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log("onTestStart", true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log("onTestSuccess", true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log("onTestFailure", true);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log("onTestSkipped", true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log("onTestFailedButWithinSuccessPercentage", true);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log("onTestFailedWithTimeout", true);
	}

	@Override
	public void onStart(ITestContext context) {
		spark = new ExtentSparkReporter(".\\ExtentReportReport\\VTigerReport.html");
		spark.config().setDocumentTitle("functional testing");
		spark.config().setDocumentTitle("Aakanksha");
		spark.config().setTheme(Theme.DARK);

		ExtentReports report = new ExtentReports();
		report.setSystemInfo("os", "windows-11");
		report.setSystemInfo("browser", "Chrome-101");
		report.attachReporter(spark);
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
	}

}
