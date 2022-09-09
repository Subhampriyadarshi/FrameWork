package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyFbLogin
{
static
{
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
}
	public static void main(String[] args) throws InterruptedException
	{
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.facebook.com/");
      Thread.sleep(3000);
      boolean button = driver.findElement(By.name("login")).isEnabled();
      Thread.sleep(3000);
      if(button==true)
    	  System.out.println("login button is enabled");
      else
    	  System.out.println("login button is not enabled");
      Thread.sleep(3000);
      driver.close();
	}

}
