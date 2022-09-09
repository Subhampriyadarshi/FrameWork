package com.actitime.generic;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * This is a generic class for webDriver element
 * @author Author
 *
 */
  public class WebDriverCommonLib
  {
  /**
  * 
  * To select the options from the list-box using index
  * @param element
  * @param text
  */
  public void selectOption(WebElement element,int i)
  {
	  Select s=new Select(element);
	  s.selectByIndex(i);
  }
  /**
   * To select the options from the list-box using visible text
   * @param element
   * @param text
   */
  public void selectOption(WebElement element,String text)
  {
	  Select s=new Select(element);
	  s.selectByVisibleText(text);
  }
  /**
   * This is a generic method for implicit wait for page load
   * @param driver
   */
  public void waitForPageLoad(WebDriver driver)
  {
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  }
  /**
   * This is a generic method for explicit wait
   * @param driver
   * @param element
   */
  public void waitForElementpresent(WebDriver driver,WebElement element)
  {
	  WebDriverWait wait=new WebDriverWait(driver,10);
	  wait.until(ExpectedConditions.visibilityOf(element));
  }
  /**
   * This is a generic method for custom wait
   * @param element
   */
  public void customWaitForElement(WebElement element)
  {
	  int i=0;
	  while(i<100)
	  {
		  try
		  {
		     element.isDisplayed();
		     break;
	      }
	      catch(Exception e)
	      {
		     i++;
	      }
      }
  }
}
