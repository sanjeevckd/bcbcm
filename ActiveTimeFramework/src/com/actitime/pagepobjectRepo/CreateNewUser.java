package com.actitime.pagepobjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.actitime.genericlib.WebDriverComnLib;
import com.thoughtworks.selenium.webdriven.commands.WaitForPageToLoad;

public class CreateNewUser extends WebDriverComnLib {
	
	
       @FindBy(id="userDataLightBox_firstNameField")
    	   
    	   WebElement userNameEdit;
    	   
       @FindBy(id="userDataLightBox_lastNameField")
       WebElement  lastNameedit;
       
       
       @FindBy(id="userDataLightBox_emailField")
       WebElement  emailEdit;
       
       
       @FindBy(name="username")
       WebElement  logindetailsEdit;
       
       @FindBy(name="password")
       WebElement  passwordEdit;
       
        @FindBy(id="userDataLightBox_passwordCopyField")
        WebElement passwordReEdit;
        
        @FindBy(xpath="//span[text()='Create User']")
        
        WebElement createUserBtn;
        
        
        public void createNewuser(String uName,String ulastname,String email,String logindetail,String pass,String repass ){
        	
        	waitForPageload();
        	userNameEdit.sendKeys(uName);
        	lastNameedit.sendKeys(ulastname);
        	emailEdit.sendKeys(email);
        	logindetailsEdit.sendKeys(logindetail);
        	passwordEdit.sendKeys(pass);
        	passwordReEdit.sendKeys(repass);
        	createUserBtn.click();
        	
        	
        	
        	
        }
       
       
       }


