package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass
{ 
  static
  {
	  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
  }
  public WebDriver driver;
  @BeforeClass (groups= {"smokeTest","regressionTest"})
  public void openBrowser()
  {
	  Reporter.log("open browser",true);
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  }
  @AfterClass (groups= {"smokeTest","regressionTest"})
  public void closeBrowser()
  {
	  Reporter.log("close browser",true);
	  driver.close();
  }
  @BeforeMethod (groups= {"smokeTest","regressionTest"})
  public void login() throws IOException
  {
	  Reporter.log("login",true);
      FileLib f=new FileLib();
      String url=f.getPropertyData("url");
	  String un=f.getPropertyData("username");
	  String pw=f.getPropertyData("password");

	  driver.get(url);
	  driver.findElement(By.id("username")).sendKeys(un);
	  driver.findElement(By.name("pwd")).sendKeys(pw);
	  driver.findElement(By.xpath("//div[.='Login ']")).click();
  }
  @AfterMethod (groups= {"smokeTest","regressionTest"})
  public void logout()
  {
	  Reporter.log("logout",true);
	  driver.findElement(By.id("logoutLink")).click();
  }
}
