package qsp;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handlingListBox 
{
  static
  {
	  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
  }
	public static void main(String[] args) throws InterruptedException 
	{
     WebDriver driver=new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     driver.get("https://www.facebook.com/");
     driver.findElement(By.linkText("Create New Account")).click();
     WebElement monthListBox=driver.findElement(By.id("month"));
     Select s=new Select(monthListBox);
     Thread.sleep(2000);
     s.selectByIndex(8);
     Thread.sleep(2000);
     s.selectByValue("2");
     Thread.sleep(2000);
     s.selectByVisibleText("Nov");
     driver.close();
	}

}
