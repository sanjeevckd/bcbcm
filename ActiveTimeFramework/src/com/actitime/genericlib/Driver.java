package com.actitime.genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {
	
	public static WebDriver driver;
	public static WebDriver getBrowser(){
		
		if(Constants.browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","D:\\Selenium downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			
		
		}else if(Constants.browserName.equals("ie")){
			
		}
            		
		
		
		else if(Constants.browserName.equals("firefox")){
			
			driver=new FirefoxDriver();
			
		}else{
			driver=new FirefoxDriver();
		}
		
		
		return driver;
	}

}
