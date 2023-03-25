package com.vinayak.test;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	
	
	
	
	
	private static ExtentReports extent;

    public static ExtentReports createInstance() {
    	
        String fileName = "ExtentReport.html";
        String filePath = System.getProperty("user.dir") + "/extentreports/" + fileName;
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(filePath);
        htmlReporter.config().setTestViewChartLocation(ChartLocation.BOTTOM);
        htmlReporter.config().setChartVisibilityOnOpen(true);
        htmlReporter.config().setTheme(Theme.STANDARD);
        htmlReporter.config().setDocumentTitle("ExtentReport");
        htmlReporter.config().setEncoding("utf-8");
        htmlReporter.config().setReportName("ExtentReport");

        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        return extent;
        
    }
	
	
	
	

}
