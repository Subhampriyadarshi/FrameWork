package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintText_TxtName_Id_Fb 
{
static
{
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
}
	public static void main(String[] args) 
	{
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.facebook.com/");
      WebElement result = driver.findElement(By.xpath("//button[@name='login']"));
      String s=result.getTagName();
      String s1=result.getAttribute("id");
      String s2=result.getAttribute("class");
      String s3=result.getAttribute("type");
      String s4=result.getText();
      System.out.println(s);
      System.out.println(s1);
      System.out.println(s2);
      System.out.println(s3);
      System.out.println(s4);
	}

}
