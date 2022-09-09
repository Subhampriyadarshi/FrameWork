package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class CustomerModule extends BaseClass
{
  @Test (groups= {"smokeTest","regressionTest"})
  //(priority = 1,invocationCount = 2)
  public void createCustomer()
  {
	  Reporter.log("createCustomer",true);
//	  driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
//	  driver.findElement(By.xpath("//div[text()='Add New']")).click();
//	  driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
//	  driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys("HDFC_110");
//	  driver.findElement(By.xpath("(//div[@class='inputContainer'])[9]")).sendKeys("rishav is mahachodu person");
  }
//  @Test 
//  //(dependsOnMethods = "createCustomer")
//  public void modifyCustomer()
//  {
//	  Reporter.log("modifyCustomer",true);
//  }
  @Test (groups="regressionTest")  
  //(dependsOnMethods = {"createCustomer","modifyCustomer"})
  public void deleteCustomer()
  {
	  Reporter.log("deleteCustomer",true);
  } 
}
