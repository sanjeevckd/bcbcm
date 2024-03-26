package com.actitime.projectandcustomer2;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.actitime.genericlib.Driver;
import com.actitime.genericlib.Excellib;
import com.actitime.pagepobjectRepo.CreateCustomer;
import com.actitime.pagepobjectRepo.Tasklist;

public class CustomerTest {
	
	Excellib elib=new Excellib();
	@Test(priority=1)
	public void CreateCustomerTest() throws InvalidFormatException, IOException{
		
		//Get data from the excel 
		String customerName=elib.getexceldata("Sheet1",1,4);
		
	
		//Get browser 
		WebDriver driver=Driver.getBrowser();
	
		  
		  Tasklist tasknavigate=PageFactory.initElements(driver,Tasklist.class);
		  
		  //Navigate to task list 
		  tasknavigate.navigateToTaskpage();
		  
		  //Navigate to Project and Customer 
		  
		   tasknavigate.navigateToProjectandcustomer();
		   
		   
		   CreateCustomer crCustomer=PageFactory.initElements(driver, CreateCustomer.class);
		   
		   //Create New customer 
		   crCustomer.ClickonCreateCustomer();
		   crCustomer.CreateNewCustomer(customerName);
		    
		   
		  
		  
		
		
		
	}

}
