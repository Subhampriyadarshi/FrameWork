package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectInReverse 
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
      Select s=new Select(mtrList);
      List<WebElement> allOpt=s.getOptions();
      int count=allOpt.size();
      System.out.println(count);
      for (int i = 0; i < count; i++)
      {
		s.selectByIndex(i);
		//Thread.sleep(2000);
	  }
      for (int i = 1; i < count; i++)
      {
		s.deselectByIndex(i);
		//Thread.sleep(2000);	
	  }
      driver.close();
	}
}
