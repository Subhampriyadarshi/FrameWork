package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoPolymorphism 
{
   static
   {
	   System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	   System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
   }
   public static WebDriver driver;
	public static void main(String[] args)
	{
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the browser name");
      String browser = sc.nextLine();
      if(browser.equals("chrome"))
      {
    	  driver=new ChromeDriver();
      }
      else if(browser.equals("firefox"))
      {
    	  driver=new FirefoxDriver();
      }
      driver.get("https://www.google.com/");
      String title=driver.getTitle();
      System.out.println(title);
      driver.close();
	}

}
