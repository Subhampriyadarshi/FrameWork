import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup1 
{
  static
  {
	  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe"); 
  }
	public static void main(String[] args) 
	{
      WebDriver driver=new ChromeDriver();
      driver.get("https://secure.indeed.com/");
      driver.findElement(By.id("apple-signin-button")).click();
      driver.findElement(By.id("login-facebook-button")).click();
      Set<String> allwh=driver.getWindowHandles();
      int count=allwh.size();
      System.out.println(count);
      driver.quit();
	}

}
