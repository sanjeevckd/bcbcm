package com.actitime.pagepobjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.actitime.genericlib.WebDriverComnLib;

public class EnterTimetrack extends WebDriverComnLib {

	@FindBy(xpath="//div[text()='TASKS']")
	WebElement TaskImg;
	
	@FindBy(xpath="//div[text()='USERS']")
	  WebElement userImg;
	
	
	public void navigateToTaskpage(){
		waitForPageload();
		TaskImg.click();
		
       }
   
	public void navigateTouser(){
		userImg.click();
	}
}
