package com.vinayak.test;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vinayak.base.BaseClass;
import com.vinayak.base.Generic;
import com.vinayak.pages.DashBordPage;
import com.vinayak.pages.LoginPage;


@Listeners(com.vinayak.test.ExtentTestNGITestListener.class)
public class TestClass extends BaseClass {

	public TestClass() throws IOException {
		super();

	}


	LoginPage  lp = new  LoginPage();
	Generic gn =new Generic();
	DashBordPage db = new DashBordPage();

	@BeforeMethod
	public void setupStart() {

		setup(); log.info("Step : 1 browser lunched ");

	}


	@Test
	public void loginEnter() throws IOException {
		lp = new LoginPage();
		lp.verifyUrl(pro.getProperty("Url"));
		lp.loginthepage(pro.getProperty("Email"), pro.getProperty("Password"));
		lp.fistPageTitleVerify(pro.getProperty("title"));

	}

		


	@Test

	public void dropDownAppiled() throws IOException {
		lp = new LoginPage();
		gn =new Generic();
		lp.verifyUrl(pro.getProperty("Url"));
		lp.loginthepage(pro.getProperty("Email"), pro.getProperty("Password"));
		db = new DashBordPage();
		db.candidatePipelineByRecruiterAssigned();
		gn.waitInSec(7);

	}
	
	@Test
	public void clickOnCheckBox() throws IOException {
		
		db = new DashBordPage();
		lp = new LoginPage();
		gn =new Generic();
		lp.verifyUrl(pro.getProperty("Url"));
		lp.loginthepage(pro.getProperty("Email"), pro.getProperty("Password"));
		db.clickOnCheckBox();
		
	}


	@AfterClass
	public void tearDown() {

		gn.waitInSec(3);
		driver.quit();
	}






}
