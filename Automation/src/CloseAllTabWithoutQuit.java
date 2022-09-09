import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllTabWithoutQuit 
{   

    static
		  {
			  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		  }
public static void main(String[] args) throws InterruptedException 
			{
		      WebDriver driver=new ChromeDriver();
		      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		      driver.get("https://demo.actitime.com/");
		      driver.findElement(By.linkText("actiTIME Inc.")).click();
		      Thread.sleep(2000);
		      Set<String> allwh=driver.getWindowHandles();
		      Thread.sleep(2000);
		      for(String wh : allwh)
		      {
		    	  driver.switchTo().window(wh);
		    	  driver.close();
		      }
		      
			}
		}

