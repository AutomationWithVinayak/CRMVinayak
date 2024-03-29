package com.vinayak.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import  org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.vinayak.util.Util;


public class BaseClass {
	
	

	public static final Logger log = LogManager.getLogger(new Object().getClass().getName());
	
	public static WebDriver  driver ;
	public static Properties pro;
	
	public BaseClass() throws IOException{
		
		FileInputStream file = new FileInputStream ("D:\\eclipseworkplace\\Appium_WorkPlace\\CRMVinayak\\src\\main\\java\\com\\vinayak\\config\\Properties.text");
		
		 pro = new Properties();
		 pro.load(file);
	
	}
	
	
	
	
	@SuppressWarnings("deprecation")
	public static void setup() {
		
		
		//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);

		driver.get(pro.getProperty("Url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Util.IMPLICITLY_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(Util.PAGE_LOAD, TimeUnit.SECONDS);
		
		
	}
	
	
	
	
	
	
	

}
