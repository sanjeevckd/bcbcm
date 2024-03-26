package com.actitime.projectandcustomertest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.actitime.genericlib.Constants;
import com.actitime.genericlib.Driver;
import com.actitime.genericlib.Excellib;
import com.actitime.genericlib.WebDriverComnLib;

public class ProjectAndCustomerTest 
{
	Excellib elib=new Excellib();
	WebDriver driver;
	WebDriverComnLib common=new WebDriverComnLib();
	public String ExpectedText ="Customer created";
	
	@Test
	
	
	public void createCustomerTest() throws InvalidFormatException, IOException
	{
		String Username=Constants.userName;
		
		String password=Constants.passWord;
		String customername	=elib.getexceldata("Sheet1", 1, 4);
		 driver =Driver.getBrowser();
		 driver.get(Constants.url);
		  
		 common.waitForPageload();
		 
	          
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	  driver.findElement(By.id("username")).sendKeys(Constants.userName);
	  driver.findElement(By.name("pwd")).sendKeys(Constants.passWord);
	  driver.findElement(By.id("loginButton")).click();
	  
	  //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  common.waitForPageload();
	  //Navigate to Task
	  driver.findElement(By.xpath("//div[text()='TASKS']")).click();
	  //Navigate to Project and Customer 
	  WebElement wd=driver.findElement(By.xpath("//a[text()='Projects & Customers']"));
	  common.waitForElementPresent(wd);
	  
	  driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
	  

	  
	  
      driver.findElement(By.xpath("//span[text()='Create Customer']")).click();
	  driver.findElement(By.id("customerLightBox_nameField")).sendKeys(customername);
	  driver.findElement(By.xpath("//div[@class='buttonIcon']/span[text()='Create Customer']")).click();
	  
	  common.waitForPageload();
	  try{
	  WebElement su_ele=driver.findElement(By.className("successmsg"));
	  
	   boolean flag= common.verifyText(su_ele, ExpectedText);
	   
	  }catch(Exception e){
		  
		   System.out.println("Create customer =======fails");
		     elib.setExceldata("Sheet1", 1, 5,"Create customer fails");
		
	  }
	  
	  WebElement drop_ele=driver.findElement(By.xpath("//select[@class='controlBorder']"));
	  
	  common.selectValue(drop_ele, "HDFC");
	  
	  
 
	  
	}
	@Test
	public void modifyCustomerTest()
	{
		
	}
}
