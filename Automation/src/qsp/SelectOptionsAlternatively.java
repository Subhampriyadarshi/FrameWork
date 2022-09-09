package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOptionsAlternatively 
{
	 static
	   {
		   System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	   }
		public static void main(String[] args) throws InterruptedException 
		{
	      WebDriver driver=new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.get("file:///C:/Users/Admin/Desktop/seleneum/Hotel.html");
	      
	      WebElement mtrList=driver.findElement(By.id("mtr"));
	      WebElement checkpostList=driver.findElement(By.id("cp"));
	      
	      Select s=new Select(mtrList);
	      Select s1=new Select(checkpostList);
	      
	      List<WebElement> allOpt=s.getOptions();
	      List<WebElement> allOpt1=s.getOptions();
	      
	      int count=allOpt.size();
	      System.out.println(count);
	      
	      int count1=allOpt1.size();
	      System.out.println(count1);
	      
	      for (int i = 0; i <count; i++)
	      {
			s.selectByIndex(i);
		  }
	    
	      for (int i = 1; i < count1; i++)
	      {
			s1.selectByIndex(i);
		  }
	      driver.close();
		}
}
