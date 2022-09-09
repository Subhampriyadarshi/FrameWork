package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllSelected 
{
   static
   {
	   System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
   }
	public static void main(String[] args) 
	{
      WebDriver driver=new ChromeDriver();
      driver.get("file:///C:/Users/Admin/Desktop/seleneum/Hotel.html");
      WebElement checkPostListBox=driver.findElement(By.id("cp"));
      Select s=new Select(checkPostListBox);
      List<WebElement> allSOptions=s.getAllSelectedOptions();
      int count=allSOptions.size();
      System.out.println(count);
      /*for(int i=0;i<count;i++)
      {
    	  String text=allSOptions.get(i).getText();
    	  System.out.println(text);
      }
      */
      for(WebElement a : allSOptions)
      {
    	  String text=a.getText();
    	  System.out.println(text);
      }
      driver.close();
	}

}
