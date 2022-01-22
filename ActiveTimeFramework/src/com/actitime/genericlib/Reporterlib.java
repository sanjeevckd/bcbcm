package com.actitime.genericlib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class Reporterlib {
	
	@Test
	public void samptest() throws IOException{
		
		String currentdir=System.getProperty("User.dir");
		
		
		WebDriver driver =new FirefoxDriver();
		driver.get("http://gmail.com");
		
		//Use getscreenshotAs() mts to a 
		
		EventFiringWebDriver ed = new EventFiringWebDriver(driver);
		
		File scrcFile=ed.getScreenshotAs(OutputType.FILE);
		
		//Use apache POI,to copy ss in to local folder
		File dstfile =new File(currentdir+"\\Screenshsot\\test1.png");
		
		
		FileUtils.copyFile(scrcFile,dstfile);

}

}