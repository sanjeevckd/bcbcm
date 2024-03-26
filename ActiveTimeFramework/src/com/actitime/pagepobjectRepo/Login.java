package com.actitime.pagepobjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.actitime.genericlib.Constants;
import com.actitime.genericlib.Driver;
import com.actitime.genericlib.WebDriverComnLib;

public class Login extends WebDriverComnLib {

	
	@FindBy(name="username")
	WebElement userNameEdt;
	
	
	@FindBy(name="pwd")
	WebElement passwordEdt;
	
	@FindBy(id="loginButton")
	WebElement loginbtn;
	
	
	public void loginToapp(String username,String password){
		waitForPageload();
		Driver.driver.get(Constants.url);
		Driver.driver.manage().window().maximize();
		userNameEdt.sendKeys(username);
		passwordEdt.sendKeys(password);
		loginbtn.click();
		
	}


	
}
