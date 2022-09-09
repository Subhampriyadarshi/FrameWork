package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class ProjectModule extends BaseClass
{
@Test (groups= {"smokeTest","regressionTest"})
//(priority = 1,invocationCount = 3)
public void createProject()
  {
	Reporter.log("create project",true);
  }
//@Test   //(dependsOnMethods = "createProject")
//public void modifyProject()
//  {
//	Reporter.log("modify project",true);
//  }
@Test  (groups="regressionTest")  
public void deleteProject()
  {
	Reporter.log("delete project",true);
  }
}
