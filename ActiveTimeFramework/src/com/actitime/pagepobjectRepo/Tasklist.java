package com.actitime.pagepobjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.actitime.genericlib.WebDriverComnLib;

public class Tasklist extends WebDriverComnLib {
	
	@FindBy(xpath="//div[text()='TASKS']")
	WebElement TaskImg;
	
	@FindBy(xpath="//a[text()='Projects & Customers']")
	WebElement NavigateProjectCustomer;
	
	
	
	
	//Navigate Method arugumet-No
	public void navigateToTaskpage(){
		waitForPageload();
		TaskImg.click();
		
       }
	
	//Navigate to Project and customer method 
	
	public void navigateToProjectandcustomer(){
		waitForPageload();
		NavigateProjectCustomer.click();
		
       }
	
     
}
