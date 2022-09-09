package com.actitime.testscript;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class TaskModule extends BaseClass
{
	@Test  (groups= {"smokeTest","regressionTest"})
	//(priority = 1,invocationCount = 3)
	public void createTask()
	  {
		Reporter.log("create Task",true);
	  }
	/**
	 @Test   //(dependsOnMethods = "createTask")
	
	public void modifyTask()
	  {
		Reporter.log("modify Task",true);
	  }
	  */
	@Test (groups="regressionTest")  
	//(dependsOnMethods = {"createTask","modifyTask"})
	public void deleteTask()
	  {
		Reporter.log("delete Task",true);
	  }
	
}
