package com.vinayak.test;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import com.google.common.io.Files;
import com.vinayak.base.BaseClass;

public class ExtentTestNGITestListener extends BaseClass implements ITestListener {
	
	
	
	public ExtentTestNGITestListener() throws IOException {
		super();
		
	}




	private static ExtentReports extent = ExtentManager.createInstance();
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<ExtentTest>();
   // private static WebDriver driver;
	@Override
	public void onTestStart(ITestResult result) {
		
		ExtentTest child = test.get().createNode(result.getMethod().getMethodName());
        test.set(child);
		log.info("Execution Start" + result.getMethod().getMethodName());
		
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		test.get().pass("Test passed");
		log.info("Test Case Passed "+result.getMethod().getMethodName());
	}
	
	
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		String methodName = result.getMethod().getMethodName();
        String exceptionMessage = Arrays.toString(result.getThrowable().getStackTrace());
        test.get().fail("Test Failed : " + methodName + " : " + exceptionMessage);
        try {
           // driver = (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
            File targetFile = new File("./screenshots/" + methodName + ".png");
            Files.copy(srcFile, targetFile);
            test.get().addScreenCaptureFromPath(targetFile.getAbsolutePath());
            
        } catch (Exception e) {
            test.get().error("Error while taking screenshot " + e.getMessage());
        }
		
        log.info("Test Case Failed "+ result.getClass().getName());
	}
	
	
	
	
	
	
	@Override
	public void onTestSkipped(ITestResult result) {
		
		test.get().skip("Test Skipped");
		log.info("Test Case Skipped "+ result.getClass().getName());
	}
	
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
		
		
	}
	
	
	
	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
		
	}
	
	
	
	
	@Override
	public void onStart(ITestContext context) {
		
		
		ExtentTest parent = extent.createTest(getClass().getName());
        test.set(parent);
		
		
	}
	
	
	
	
	@Override
	public void onFinish(ITestContext context) {
		log.info(""
				+ "------------------------------------"+'\n'
				+ "---------VINAYAK-FRAMEWORK----------"+'\n'
				+ "------------------------------------"+'\n'
				+ "------------------------------------"+'\n'
				+ "--------Execution_Completed---------"+'\n'
				+ "------------------------------------"+'\n'
				+ "------------------------------------"+'\n'
				+ "-------------C--R--M----------------"+'\n'
				+ "------------------------------------"+'\n'
				+ "----------------*-------------------"+'\n'
				+ "------------------------------------"+'\n'
				+ "------------------------------------"+'\n'
				+"------------------------------------"+'\n'
				+"------------------------------------");
		
		extent.flush();
		
	}
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}


