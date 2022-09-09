package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDateOfBirth
{
  static
  {
	  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
  }
	public static void main(String[] args) throws InterruptedException 
	{
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.facebook.com/");
     driver.findElement(By.linkText("Create New Account")).click();
     WebElement day=driver.findElement(By.name("birthday_day"));
     Select s1=new Select(day);
     Thread.sleep(2000);
     s1.selectByVisibleText("14");
     WebElement month=driver.findElement(By.name("birthday_month"));
     Select s2=new Select(month);
     Thread.sleep(2000);
     s2.selectByVisibleText("Feb");
     WebElement year=driver.findElement(By.name("birthday_year"));
     Select s3=new Select(year);
     Thread.sleep(2000);
     s3.selectByVisibleText("1994");
     
	}

}
