package com.actitime.pagepobjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.actitime.genericlib.WebDriverComnLib;

public class CreateCustomer extends WebDriverComnLib{
	
	
	//Locator for Customer name filed 
	@FindBy(id="customerLightBox_nameField")
	WebElement customerNameEdit;
	
	//locator for createCustomer button
	@FindBy(xpath="//div[@class='buttonIcon']/span[text()='Create Customer']")
	WebElement createCustomerBtn;
	
	//Locator for Projectcustomer button 
	@FindBy(xpath="//span[text()='Create Customer")
	WebElement projectCustomerBtn;
	
	
	//click on Project and customer button 
	 public void ClickonCreateCustomer(){
   	  waitForPageload();
   	  
   	  projectCustomerBtn.click();
   	  }
	 
	 //Click create new customer button
	public void CreateNewCustomer(String customerName){
		
		waitForElementPresent(customerNameEdit);
		
		customerNameEdit.sendKeys(customerName);
		createCustomerBtn.click();
		
	}
}
