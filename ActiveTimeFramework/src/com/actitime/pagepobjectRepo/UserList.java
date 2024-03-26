package com.actitime.pagepobjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.actitime.genericlib.WebDriverComnLib;

public class UserList extends WebDriverComnLib {

	
	@FindBy(xpath="//div/span[text()='User']")
	
	WebElement createBtn;
	
	@FindBy(xpath="//div[@class='pagetitle']")
	WebElement succMsg;
	
	
	
	
	public WebElement getCreateBtn() {
		return createBtn;
	}









	public WebElement getSuccMsg() {
		return succMsg;
	}




	




	public void clickcreateuser(){
		
		waitForPageload();
		
		createBtn.click();
	}
	
	
}
