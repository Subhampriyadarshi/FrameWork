package qsp;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect 
{
 static
 {
	 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
 }
	public static void main(String[] args) 
	{
     WebDriver driver=new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
     driver.get("file:///C:/Users/Admin/Desktop/seleneum/Hotel.html");
     WebElement mtrListbox=driver.findElement(By.id("mtr"));
     Select s=new Select(mtrListbox);
     s.selectByIndex(0);
     s.selectByValue("v");
     s.selectByVisibleText("dosa");
     boolean status=s.isMultiple();
     System.out.println(status);
     /*s.deselectByIndex(2);
     s.deselectByValue("d");
     s.deselectByVisibleText("idly");
     driver.close();*/
	}
}
