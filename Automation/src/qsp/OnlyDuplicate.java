package qsp;

import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OnlyDuplicate 
{
  static
  {
	  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
  }
	public static void main(String[] args) 
	{
      HashSet<String> hs=new HashSet<String>();
      WebDriver driver=new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
      driver.get("file:///C:/Users/Admin/Desktop/seleneum/Hotel.html");
      WebElement mtrListBox=driver.findElement(By.id("mtr"));
      Select s=new Select(mtrListBox);
      List<WebElement> onlyDuplicat=s.getOptions();
      int count=onlyDuplicat.size();
      System.out.println(count);
      for(WebElement we : onlyDuplicat)
      {
    	  String text=we.getText();
    	  if(hs.add(text)==false)
    	  {
    		  System.out.println(text); 
    	  }
      }
     /* for (int i = 0; i < count; i++) 
      {
		String text = onlyDuplicat.get(i).getText();
		if (hs.add(text) == false)
		{
		   System.out.println(text);	
		}
	//here HashSet will not allow duplicate value so the add() method will return false 	
	  }*/
      driver.close();	  
	}
}
