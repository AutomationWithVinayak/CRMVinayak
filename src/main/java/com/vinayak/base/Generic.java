package com.vinayak.base;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Generic extends BaseClass{


	public Generic() throws IOException {
		super();

	}


	/**
	 * 
	 * *******@Authour :- Vinayak , Purpose make common method for wait in second (thread.sleep from java util)*****************
	 **/

	public void waitInSec(int a) {

		int b =1000*a;

		try {
			Thread.sleep(b);
		} catch (InterruptedException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		return ;
	}

	
	

	/**** 
	 * *******@Authour :- Vinayak , Purpose make common method for click on element (only for element with text <tagname..>text</tagname ..>  ****************
	 ****/	

	public void getDynamicClick(String text) {


		driver.findElement(By.xpath("//*[contains(text(),'"+text+"')]")).click();

	}


	/****
	 * 
	 * *******@Authour :- Vinayak , Purpose make common method for VerifyElementIs Present or Not (only for element with text <tagname..>text</tagname ..>  ****************
	 ****/	


	public void textIsDisplay(String text) {

		boolean t = driver.findElement(By.xpath("//*[contains(text(),'"+text+"')]")).isDisplayed();
		if(t== true) {

			log.info(text+" Text Is Present");
		}
		else {
			log.info(text+" Text Is Not Present");

		}
		

	}




	/**
	 * 
	 **@Authour :- Vinayak , Purpose Click On Eelement By Xpath R-Variable 
	 * 
	 */


	public void clickOnElement(WebElement resumeBtn) {

		((WebElement) driver.findElements((By) resumeBtn)).click();
	
	}





	/*****
	 ******@Authour:Vinayak Below three method for handle dropdown or list box by index , value and text
	 * 
	 *****/


	public void listBoxByText(WebElement element , String text) {

		Select sc = new Select(element);
		sc.selectByVisibleText(text);

	}

	public void listBoxByValue(WebElement element , String value) {

		Select sc = new Select(element);
		sc.selectByVisibleText(value);
		
	}

	public void listBoxByIndex(WebElement element , int index) {

		Select sc = new Select(element);
		sc.selectByIndex(index);
		return ;
	}



	/**
	 * 
	 **@Authour :- Vinayak , Purpose ScrollOnElement(By xpath ,locator WebElement) Use JavascriptEcxecutor
	 * 
	 */


	public void scrollOnElement(WebElement element) {

		//	  JavascriptExecutor js = ((JavascriptExecutor)driver); 
		//	  js.executeScript("arguments[0].scrollIntoView(true);",element );
		//	  
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
		log.info("Successfully Scroll On  :- "+ element);




	}



	/**
	 * 
	 **@Authour :- Vinayak , perform mouse overhover Action By using Action class(It accept webelement argument R-Variable)
	 * 
	 */


	public void mouseOverHoverOnElement(WebElement target) {

		Actions ac = new Actions(driver);
		ac.moveToElement(target).build().perform();	  
		return;
	}


	/**
	 * 
	 **@Authour :- Vinayak , Verify Element is display Or Not
	 * 
	 */ 


	public void elemenetIsDisplay(WebElement element) {

		if(element.isDisplayed() == true ) {

			log.info(element +" is Display");
		}
		else {

			log.info(element +" is not  Display");
		}

			
	}







	public void tearDown() {

		waitInSec(3);
		driver.quit();
	}


	
	/**
	 * 
	 **@Authour :- Vinayak ,This Method Is use to Handal DropDown / ListBox Withot Select By Visible Text first argument is xpath and secind is visible text 
	 * 
	 */ 


	public void dropDowm(By element , String ElementTextOrName ) {

		List<WebElement> listOfDropDown = driver.findElements(element);
		int size = listOfDropDown.size();
		System.out.println(size);
		for(int i=0 ; i<=size-1; i++ ) {
			if(listOfDropDown.get(i).getText().contains(ElementTextOrName)) {
				listOfDropDown.get(i).click();
				break;
			}	
		}	
	}

	
	
	

	/**
	 * 
	 **@Authour :- Vinayak ,This Method Is use to Handal iframe by element (xpath) 
	 * 
	 */ 


    public void focusOnIframe(WebElement element) {
    	
    	driver.switchTo().frame(element);
    	
    log.info("focus on iframe : -  "+element);
    	
    }
    
    /**
	 * 
	 **@Authour :- Vinayak ,This Method Is use to Handal Windows by Id (Id Is in string format)
	 * 
	 */   
    
   public void windowHandal(String windowId) {
	   
	   driver.switchTo().window(windowId);
	   
   }
  
   
   /**
	 * 
	 **@Authour :- Vinayak ,This Method Is use to get  Windows handal id by passing int para (its ined number of id which you want if you are on main first page and click on element and one tab is open then its index number is 1 )
	 */ 
   
   
   public static String getWindowHandalId(int i) {
	   
	   Set<String> ids=driver.getWindowHandles();
	   ArrayList<String> a = new ArrayList<String>(ids);
	   String  windowId = a.get(i);
	   return windowId ;
	   
   }
    
	

}