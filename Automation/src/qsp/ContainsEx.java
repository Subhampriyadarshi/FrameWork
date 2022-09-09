package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsEx 
{
    static
    {
    	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
    }
	public static void main(String[] args)
	{
       WebDriver driver=new ChromeDriver();
       driver.get("https://gmail.com/");
       String url=driver.getCurrentUrl();
       if(url.contains("https://accounts.google.com/"))
       {
    	   System.out.println("url is successfully navigated and verified");
       }
       else
       {
    	   System.out.println("url is not navigated and verified");
       }
       
	}

}
