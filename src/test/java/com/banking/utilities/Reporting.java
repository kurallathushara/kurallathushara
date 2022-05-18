package com.banking.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reporting implements ITestListener {
	public ExtentSparkReporter reporter;
	public ExtentReports extent;
	public ExtentTest logger;

	@Override
	public void onTestStart(ITestResult result) {
		String timestamp= new SimpleDateFormat("yyy.MM.dd.hh.mm.ss").format(new Date());
		String repName= "Test-Report-"+timestamp+".html";
	
		String path= System.getProperty("user.dir")+"/test-output/"+repName;
		reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("SDET Report");
		reporter.config().setDocumentTitle("Test Results");
		extent= new ExtentReports();
		extent.attachReporter(reporter);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger= extent.createTest(result.getName());
		logger.log(Status.PASS, MarkupHelper.createLabel(result.getName(), ExtentColor.GREEN));
	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger= extent.createTest(result.getName());
		logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName(), ExtentColor.RED));
		String screenshotPath= System.getProperty("user.dir")+"\\Screenshots\\"+result.getName();
		File f= new File(screenshotPath);
		if(f.exists())
		{
		logger.fail("Screenshot is below:" + logger.addScreenCaptureFromPath(screenshotPath));
		}
		
			
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger=extent.createTest(result.getName()); 
		logger.log(Status.SKIP,MarkupHelper.createLabel(result.getName(),ExtentColor.ORANGE));
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
	

}
}