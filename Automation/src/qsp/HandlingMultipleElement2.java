package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElement2 
{
   static
   {
	   System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
   }
	public static void main(String[] args) 
	{
     WebDriver driver=new ChromeDriver();
     driver.get("file:///C:/Users/Admin/Desktop/seleneum/table.html");
     List<WebElement> allLinks=driver.findElements(By.tagName("td"));
     int count=allLinks.size();
     System.out.println(count);
     for(WebElement a: allLinks)
     {
     String text=a.getText();
     System.out.println(text);
     }
     driver.close();
	}

}
