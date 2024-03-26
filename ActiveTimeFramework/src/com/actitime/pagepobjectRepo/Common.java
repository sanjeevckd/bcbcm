package com.actitime.pagepobjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Common {
	
	@FindBy(id="logoutLink")
	WebElement logout;
	
	public void logout(){
		
		logout.click();
	}

}
