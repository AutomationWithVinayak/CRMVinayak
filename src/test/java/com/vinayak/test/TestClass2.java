package com.vinayak.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.vinayak.base.BaseClass;
import com.vinayak.base.Generic;
import com.vinayak.pages.DashBordPage;
import com.vinayak.pages.LoginPage;

public class TestClass2 extends BaseClass {

	
	
	public TestClass2() throws IOException {
		super();
		
	}
	
	Generic gn = new Generic();
	DashBordPage db = new DashBordPage();
	LoginPage  lp = new LoginPage();
	
	
	@BeforeMethod
	public void initilization() {
		
		setup();	
		
	}
	
	
	
	@Test
	public void testExplicitWait() throws Throwable {
		lp = new LoginPage();
		db = new DashBordPage();
		lp.loginthepage(pro.getProperty("Email"), pro.getProperty("Password"));
		db.elementVerification();
		System.out.println();
		
		
	}
	
	
	
	@AfterMethod
	public void tearDown() throws Throwable {
		gn = new Generic();
		gn.tearDown();
		log.info("tearDown.......");
	}

}
