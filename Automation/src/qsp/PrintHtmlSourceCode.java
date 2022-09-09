package qsp;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintHtmlSourceCode
{
	static 
	{
	  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       driver.get("https://www.facebook.com/");
       Thread.sleep(2000);
       String htmlCode=driver.getPageSource();
       System.out.println(htmlCode);
       driver.close();
	}
}
