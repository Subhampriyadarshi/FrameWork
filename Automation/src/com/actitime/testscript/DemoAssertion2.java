package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoAssertion2 
{
  static
  {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");  
  }
  @Test
	public static void main(String[] args)
	{
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.google.com/");
      String eTitle="Soogle";
      String aTitle=driver.getTitle();
      SoftAssert s=new SoftAssert();
      s.assertEquals(aTitle,eTitle);
      driver.close();
      s.assertAll();
	}

}
