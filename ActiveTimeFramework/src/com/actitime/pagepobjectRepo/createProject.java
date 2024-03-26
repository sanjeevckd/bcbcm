package com.actitime.pagepobjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import com.actitime.genericlib.WebDriverComnLib;

public class createProject extends WebDriverComnLib {
	
	String custName ="HDFC";
	
	@FindBy(xpath="//div[text()='TASKS']")
	WebElement TaskImg;
	
	@FindBy(xpath="//a[text()='Projects & Customers']")
	WebElement NavigateProjectCustomer;
	
	@FindBy(xpath="//span[text()='Create Project']")
	
	WebElement clickproject;
	
	
	@FindBy(id="projectPopup_projectNameField")
	WebElement projectNameEdit;
	
	@FindBy(id="//button[@id='ext-gen23']")
	WebElement clickOnCustomerDropdown;
	
	@FindBy(xpath="//li[a[contains(text(),'HDFC'"
			+ ")]]")
	WebElement selectElement;
	
	@FindBy(xpath="//span[text()='Create Project']")
	WebElement clickCreateProject;
	
	
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
	
	public void createProject(String pName,String custName,String proDes){
		
		waitForPageload();
		clickproject.click();
		waitForElementPresent(projectNameEdit);
		projectNameEdit.sendKeys(pName);
		clickOnCustomerDropdown.click();
		selectElement.click();
		
		
		
	}
}
