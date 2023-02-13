package com.vinayak.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vinayak.base.Generic;



public class LoginPage extends Generic {

	
	public LoginPage() throws IOException {
		super();
		
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	Generic gn =new Generic();
	
	@FindBy(id="sTestEmail") private WebElement email;
	@FindBy(id="sTestPassword") private WebElement pwd;
	@FindBy(xpath="//button[@id=\"sTestLoginBtn\"]") private WebElement loginBtn;
	
	
	
	public void verifyUrl(String url ) {
		
		String actualUrl =driver.getCurrentUrl();
		
		if (url.equals(actualUrl)){
			
			log.info("Url is matched");
		}
		
	}
	
	
	
	public void loginthepage(String userid , String pass ) {
	
		
		if(email.isDisplayed() == true ) { log.info("email input tab  Present");}
		email.sendKeys(userid);   log.info("email entered");
		
		if(pwd.isDisplayed() == true ) {  log.info("pwd  input tab Present"); }
		pwd.sendKeys(pass);  log.info("password entered"); 
		
		if(loginBtn.isDisplayed() == true) {   log.info("loginBtn Present");}
		loginBtn.click();  log.info("Clicked on loginBtn ");
		
			
	}

	
	
	
	public void fistPageTitleVerify(String exTitle) {
		
		String actualtitle=driver.getTitle();
	
		if(actualtitle.equals(exTitle)) {
			
			log.info("DashBord Page Open");
		}
		
	}
	
	
	
	
	
}
