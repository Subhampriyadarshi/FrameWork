
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChildThenParentWithoutLoop
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
      Set<String> allwh=driver.getWindowHandles();
      Iterator<String> itr=allwh.iterator();
      String pwh=itr.next();
      String cwh=itr.next();
      Thread.sleep(2000);
      driver.switchTo().window(cwh);
      driver.close();
      driver.switchTo().window(pwh);
      driver.close();
      
	}

}
