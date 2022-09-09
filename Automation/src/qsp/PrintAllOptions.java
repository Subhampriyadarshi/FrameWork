package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptions 
{
  static
  {
	  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
  }
	public static void main(String[] args) 
	{
      WebDriver driver=new ChromeDriver();
      driver.get("file:///C:/Users/Admin/Desktop/seleneum/Hotel.html");
      WebElement mtrListBox = driver.findElement(By.id("mtr"));
      Select s=new Select(mtrListBox);
      List<WebElement> allOptions=s.getOptions();
      /*for(int i=0;i<allOptions.size();i++)
      {
    	  String text=allOptions.get(i).getText();
    	  System.out.println(text);
      }*/
      for(WebElement we : allOptions)
      {
    	  String text=we.getText();
    	  System.out.println(text);
      }
      
	}

}
