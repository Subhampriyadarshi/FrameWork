package com.actitime.testscript;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import com.actitime.generic.BaseClass;

//public class ListenerImplementation extends BaseClass implements ITestListener 
//{
//  static
//  {
//	  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
//  }
//  @Override
//  public void onTestStart(ITestResult result)
//  {
//	  
//  }
//  @Override
//  public void onTestSuccess(ITestResult result)
//  {
//	  
//  }
//  @Override
//  public void onTestFailure(ITestResult result)
//  {
//	  String res=result.getName();
//	  WebDriver driver=new ChromeDriver();
//	  driver.get("https://www.facebook.com/");
//	  TakesScreenshot t=(TakesScreenshot) driver;
//	  File src=t.getScreenshotAs(OutputType.FILE);
//	  File dest=new File("./screenshot/"+res+".png");
//	  try 
//	  {
//		  FileUtils.copyFile(src,dest);
//	  }
//	  catch(IOException)
//	  {
//		  driver.close();
//	  }
//	  @Override
//	  public void onTestSkipped(ITestResult result)
//	  {
//		  
//	  }
//	  public void onTestFailedButWithInSuccessPercentage(ITestResult result)
//	  {
//		  
//	  }
//	  public void onStart(ITestContext context)
//	  {
//		  
//	  }
//	  Public void onFinish(ITestContext context)
//	  {
//		  
//	  }
//   }
//  }
