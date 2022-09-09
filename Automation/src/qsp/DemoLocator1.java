package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLocator1
{
    static
    {
	  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
    }
  
	public static void main(String[] args) throws InterruptedException
	{
      WebDriver driver=new ChromeDriver();
      driver.get("file:///C:/Users/Admin/Desktop/seleneum/demo.html");
      Thread.sleep(2000);
      driver.findElement(By.tagName("a")).click();
      Thread.sleep(2000);
      driver.navigate().back();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//a[2]")).click();
      Thread.sleep(2000);
      driver.navigate().back();
      Thread.sleep(2000);
      driver.findElement(By.name("n1")).click();
      Thread.sleep(2000);
      driver.navigate().back();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//a[2]")).click();     
	}
}
