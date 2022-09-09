package qsp;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResumeUploadOnNaukri 
{
  static
  {
	  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
  }
  public static void main(String[] args) throws InterruptedException 
  {  
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.id("login_Layer")).click();
	driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("priyadarshi169@gmail.com");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("@ssprasad14");
	driver.findElement(By.xpath("//button[@type='submit']")).submit();
	
	//Thread.sleep(5000);
	driver.findElement(By.xpath("//div[text()='SUBHAM PRIYADARSHI']")).click();
	//driver.findElement(By.xpath("//input[@type='button']")).click();
	Thread.sleep(5000);
	File f=new File("./data/Resume (1).pdf");
    String absolutePath=f.getAbsolutePath();
    driver.findElement(By.id("attachCV")).sendKeys(absolutePath);
    driver.close();
  }
}
