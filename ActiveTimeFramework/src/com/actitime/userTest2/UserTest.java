package com.actitime.userTest2;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.actitime.genericlib.Constants;
import com.actitime.genericlib.Driver;
import com.actitime.genericlib.Excellib;
import com.actitime.genericlib.WebDriverComnLib;
import com.actitime.pagepobjectRepo.Common;
import com.actitime.pagepobjectRepo.CreateNewUser;
import com.actitime.pagepobjectRepo.Login;
import com.actitime.pagepobjectRepo.UserList;
import com.actitime.pagepobjectRepo.EnterTimetrack;

public class UserTest {
  
	//Object declaration
	Excellib elib;
	WebDriver driver;
	Login loginpage;
	EnterTimetrack navigateTo;
	UserList ulist;
	CreateNewUser newUser;
	Common comm;
	 
	 
     @BeforeClass
     public void configBeforeClass(){
    	 elib= new Excellib();
    	 driver=Driver.getBrowser();
    	loginpage=PageFactory.initElements(driver,Login.class);
    	navigateTo=PageFactory.initElements(driver,EnterTimetrack.class);
    	ulist=PageFactory.initElements(driver,UserList.class);
    	newUser=PageFactory.initElements(driver,CreateNewUser.class);  
    	comm=PageFactory.initElements(driver, Common.class);
     }
     
     @BeforeMethod
     public void configBeforemethod(){
    	 Reporter.log("Step1 : Login to application");
    	 
    	 loginpage.loginToapp(Constants.userName,Constants.passWord);
    	 Reporter.log("Login is Sucessfull");
    	 
     }
	 
	@Test
	public void createUserTest() throws InvalidFormatException, IOException{
		
		//Get data from Excel file 
		 Reporter.log("Get data from excel");
		
		  String uname=elib.getexceldata("Sheet1",3,3);
		  String lastname=elib.getexceldata("Sheet1",3,4);
		  String emailid=elib.getexceldata("Sheet1",3,5);
		  
		   String logindetails =elib.getexceldata("Sheet1",3,6);
		  String password=elib.getexceldata("Sheet1",3,7);
		  String repass=elib.getexceldata("Sheet1",3,8);
		  String extMsg=elib.getexceldata("Sheet1",3,9);
		
		 
		//get Browser object
		//WebDriver driver=Driver.getBrowser();
		
		//login to app
		
		//Login loginpage=PageFactory.initElements(driver,Login.class);
			
		
		//loginpage.loginToapp(Constants.userName,Constants.passWord);
		
		//EnterTimetrack navigateTo=PageFactory.initElements(driver,EnterTimetrack.class);
		
		   Reporter.log("Navigate to taskpage ");
		//navigate task page 
		navigateTo.navigateToTaskpage();
	  
		 Reporter.log("Navigate to User page");
		//navigate to User page 
		navigateTo.navigateTouser();
		
		//Click on create new user
		  //UserList ulist=PageFactory.initElements(driver,UserList.class);
		  
		 Reporter.log("Step 4 :User creation page");
		  ulist.clickcreateuser();
		
	     
		  
		  
		 // CreateNewUser newUser=PageFactory.initElements(driver,CreateNewUser.class);
		  
		   Reporter.log("Step5:Create user");
		  //Enter the details for new User 
		  newUser.createNewuser(uname,lastname,emailid,logindetails,password,repass);
		  
		  //Verify the message 
		  String actMsg=ulist.getSuccMsg().getText();
	      Assert.assertEquals(actMsg,extMsg,"User creation is faile==Fail");
	       Reporter.log("actMsg="+actMsg);
	      
	       Reporter.log("Step 6:Create user suceess");
		  
	      
	      //Logout
	      
	      // Common comm=PageFactory.initElements(driver, Common.class);
	       
	      // comm.logout();
		  
		 
		 
	}
	
	@Test
	public void modifyUser(){
		
		
		
		
	}
	@AfterMethod
	public void configAfterMethod(){
		 Reporter.log("step 7:logout");
		  comm.logout();
	}
	
	@AfterClass
	public void configAfterclass(){
		 Reporter.log("Close browser");

		driver.close();
	}
	
}
