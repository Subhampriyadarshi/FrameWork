package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateClass  
{
    static
    {
    	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
    }
	public static void main(String[] args) throws InterruptedException
	{
      WebDriver driver=new ChromeDriver();
      driver.navigate().to("https://www.google.com");
      Thread.sleep(2000);
      String url=driver.getCurrentUrl();
      if(url.equals("https://www.google.com/"))
      {
    	  System.out.println("url is successfully navigated and verified");
      }
      else
      {
    	  System.out.println("url is not navigating and failed");
      }
      driver.get("https://www.gmail.com");
      Thread.sleep(2000);
      driver.navigate().back();
      Thread.sleep(2000);
      driver.navigate().forward();
      Thread.sleep(2000);
      driver.navigate().refresh();
      Thread.sleep(2000);
      driver.close();
	}
}
