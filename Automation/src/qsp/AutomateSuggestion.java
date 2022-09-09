package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateSuggestion 
{
  static
  {
	  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
  }
  
	public static void main(String[] args) throws InterruptedException
	{
       WebDriver driver=new ChromeDriver();
       driver.get("https://www.flipkart.com/");
       Thread.sleep(3000);
       //driver.findElement(By.xpath("(//button)[2]")).click();
       driver.findElement(By.name("q")).sendKeys("iphone");
       Thread.sleep(2000);
       List<WebElement> allSugg=driver.findElements(By.xpath("//a[contains(.,'iphone')]"));
       int count=allSugg.size();
       System.out.println(count);
       for(WebElement a: allSugg)
       {
    	   String text=a.getText();
    	   System.out.println(text);
       }
       allSugg.get(count-3).click();
       driver.close();
       
	}

}
