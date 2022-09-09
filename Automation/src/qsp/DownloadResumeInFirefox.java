package qsp;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DownloadResumeInFirefox 
{
  static
  {
	  System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	  
  }
	public static void main(String[] args) throws InterruptedException 
	{
    WebDriver driver=new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    driver.get("https://www.naukri.com/"); 
    driver.findElement(By.xpath("(//div[@class='mTxt'])[5]")).click();
  	driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("priyadarshi169@gmail.com");
  	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("@ssprasad14");
  	driver.findElement(By.xpath("//button[@type='submit']")).submit();
  	driver.findElement(By.xpath("//div[text()='SUBHAM PRIYADARSHI']")).click();
  	Thread.sleep(5000);
  	driver.findElement(By.xpath("(//i[text()='Download'])[1]")).click(); 
  	driver.close();
	}

}
