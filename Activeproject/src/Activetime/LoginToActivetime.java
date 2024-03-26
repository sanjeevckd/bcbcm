package Activetime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginToActivetime {
	
	WebDriver driver;
//  @Test(enabled=true)
//  public void openbrowser() {
//	  
//	  WebDriver driver =new FirefoxDriver();
//	  driver.get("http://localhost/login.do");
//	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//  }
//  
  
  @Test
  @Parameters({"sUname","pwd"})
  public void login(String sUname,String pwd){

	  WebDriver driver =new FirefoxDriver();
	  driver.get("http://localhost/login.do");
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
   driver.findElement(By.id("username")).sendKeys(sUname);
  driver.findElement(By.name("pwd")).sendKeys(pwd);
  driver.findElement(By.id("loginButton")).click();
 
  }
}
