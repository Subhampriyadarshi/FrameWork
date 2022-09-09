package qsp;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResumeUpload
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
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[text()='UPDATE PROFILE']")).click();
	Thread.sleep(5000);
	//driver.findElement(By.xpath("//input[@id='attachCV']")).click();
	Thread.sleep(5000);
	File f=new File("./data/Resume.docx");
    String absolutePath=f.getAbsolutePath();
    driver.findElement(By.xpath("(//input[@class='fileUpload waves-effect waves-light btn-large'])[1]")).sendKeys(absolutePath);
  }
}

