package com.actitime.genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverComnLib implements Constants {
	
	    public void waitForPageload(){
	      Driver.driver.manage().timeouts().implicitlyWait(Constants.maxTimeoutLimit,TimeUnit.SECONDS);
	    }
        
	   public void waitForElementPresent(WebElement wd){
		   
		   WebDriverWait wb =new WebDriverWait(Driver.driver, Constants.maxTimeoutLimit);
		   
		   wb.until(ExpectedConditions.visibilityOf(wd));
		   
		   
	   }

		
        public void selectValue(WebElement wb,String value){
        	
        	Select sel=new Select(wb);
        	sel.selectByVisibleText(value);
        	
        }
	   
        public void selectValue(WebElement selwb,int index){
        	Select sel =new Select(selwb);
        	sel.selectByIndex(index);
        	
        }
        
        public boolean verifyText(WebElement wb,String ExpectedText){
           boolean flag=false;
           String value=wb.getText();
           if(value.endsWith(" successfully created.")){
        	  System.out.println(ExpectedText+ "Data is verified ===Pass"); 
        	  }else
        	  {
        		  System.out.println(ExpectedText+"Data not present===Fail");
        	  }
           
           
        	return flag;
        }
        
        public void acceptAlert(){
        	
        	Alert alt=Driver.driver.switchTo().alert();
        	
        	alt.accept();
        }
        
        public void cancelAlert(){
        	Alert alt=Driver.driver.switchTo().alert();
        	alt.dismiss();
        }
        
        
}
