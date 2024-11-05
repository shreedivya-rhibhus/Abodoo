package com.qa.abodoo.listeners;
	import org.testng.ITestContext;
	import org.testng.ITestListener;
	import org.testng.ITestResult;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Logger;

public class TestReport implements ITestListener{
	public ExtentReports extent;
	public ExtentTest test;
	private String AbodooReportPath = "C:\\Users\\Rhibhus\\eclipse-workspace\\Abodoo\\AbodooReport\\Report";
	private String ReportName1 = "AbodooExecutionReport";
	TestReport testStatus;

	 public Logger logger = Logger.getLogger(TestReport.class.getName());
	
////   Constructor accepting ExtentReports object
//	 public TestReport(ExtentReports extent) {
//	       this.extent = extent;
//	    }
	 
	 @Override
	    public void onStart(ITestContext context) {
		 LocalDate currentDate = LocalDate.now();
			DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			String formattedDate = dateFormat.format(currentDate);
			// Get the current time
			java.util.Date currentTime = new java.util.Date();
			// Create a SimpleDateFormat object with the desired format
			SimpleDateFormat sdf = new SimpleDateFormat("hh'.'mm'.'ss");
			// Format the current time using the SimpleDateFormat object
			String formattedTime = sdf.format(currentTime);
			System.out.println("Current Date: " + formattedDate);
			System.out.println("Current Time: " + formattedTime);
			String ReportName = ReportName1 + formattedDate + "&" + formattedTime + ".html";
			ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(AbodooReportPath + ReportName);
			System.out.println("reportLocation ReportName: " + AbodooReportPath+ ReportName);
			extent = new ExtentReports();
			extent.attachReporter(htmlReporter);
	
//			testStatus = new TestReport(extent);
	//		testStatus = new TestReport();
		 }

	    @Override
	    public void onTestStart(ITestResult result) {
	        test = extent.createTest(result.getMethod().getMethodName());
	         
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {
	        // This method will be called on test success
	        System.out.println("*** Test execution successful: " + result.getName());
	        logger.info("Test passed: " + result.getName());
	        test.log(Status.PASS, "Test Execution passed");
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {
	    	
	    	String failReason = result.getThrowable().getMessage(); // Get the fail reason message

	        System.out.println("*** Test execution skipped: " + result.getName() + " Reason: " + failReason);
	        logger.info("Test skipped: " + result.getName() + " Reason: " + failReason);
	        test.log(Status.FAIL, "Test Execution Failed. Reason: " + failReason);
	        if (result.getThrowable() instanceof AssertionError) {
	            String message = result.getThrowable().getMessage();
	            // Log the assertion failure message to your desired reporting destination
	            // For example, you could log it to a file, database, or custom reporting framework
	            System.out.println("Assertion failed: " + message);
	        }
	    }

	    @Override
	    public void onTestSkipped(ITestResult result) {
	        String skipReason = result.getThrowable().getMessage(); // Get the skip reason message

	        System.out.println("*** Test execution skipped: " + result.getName() + " Reason: " + skipReason);
	        logger.info("Test skipped: " + result.getName() + " Reason: " + skipReason);
	        test.log(Status.SKIP, "Test Execution Skipped. Reason: " + skipReason);
	    }

	    @Override
	    public void onFinish(ITestContext context) {
			extent.flush();
	    }
}
