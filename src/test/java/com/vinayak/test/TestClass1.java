package com.vinayak.test;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vinayak.base.BaseClass;
import com.vinayak.pages.DashBordPage;
import com.vinayak.pages.LoginPage;

@Listeners(com.vinayak.test.ExtentTestNGITestListener.class)
public class TestClass1 extends BaseClass{

	public TestClass1() throws IOException {
		super();
		
	}
	
	DashBordPage db= new DashBordPage();
	LoginPage  lb = new LoginPage();
	
	@BeforeMethod
	public void m2() {
		setup();
		
	}
	
	
	@Test
	public void m1() throws IOException {
		db= new DashBordPage();
		lb = new LoginPage();
		
		lb.loginthepage(pro.getProperty("Email"), pro.getProperty("Password"));
		db.iWantDemo();
		
	}

}
