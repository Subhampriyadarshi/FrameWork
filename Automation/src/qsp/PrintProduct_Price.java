package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintProduct_Price
{
   static
   {
	   System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
   }
     
	public static void main(String[] args)
	{
      WebDriver driver=new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
      driver.get("https://www.flipkart.com/");
      //Thread.sleep(3000);
      driver.findElement(By.xpath("(//button)[2]")).click();
      
      driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone 13 pro max"+Keys.ENTER);
      
              List<WebElement> prodname=
    	driver.findElements(By.xpath("//div[@class='_4rR01T']"));
              List<WebElement> price=
        driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
              
      int count=prodname.size();
      System.out.println(count);
      
      for(int i=0;i<count;i++)
      {
    	  String text=prodname.get(i).getText();
    	  String text1=price.get(i).getText();
    	  System.out.println(text+ "  ----->   "+text1);
    	  
      }
	}

}
