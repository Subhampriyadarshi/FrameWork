package qsp;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPopup 
{
 static
 {
	 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
 }
	public static void main(String[] args) throws InterruptedException 
	{
     WebDriver driver=new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
     driver.get("https://demo.automationtesting.in/Alerts.html");
     driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
     WebDriverWait wait=new WebDriverWait(driver,10);
     wait.until(ExpectedConditions.alertIsPresent());
     Alert a=driver.switchTo().alert();
     String text=a.getText();
     a.accept();
     System.out.println(text);
     //driver.close();
	}

}
