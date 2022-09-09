package qsp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Synchronization 
{
  static
  {
	  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
  }
	public static void main(String[] args) throws InterruptedException
	{
     WebDriver driver=new ChromeDriver();
     driver.get("https://demo.actitime.com/");
     driver.findElement(By.id("username")).sendKeys("admin");
     driver.findElement(By.name("pwd")).sendKeys("manager");
     driver.findElement(By.xpath("//div[text()='Login ']")).click();
     Thread.sleep(5000);
     driver.findElement(By.id("logoutLink")).click();
     Thread.sleep(2000);
     driver.close();
	}

}
