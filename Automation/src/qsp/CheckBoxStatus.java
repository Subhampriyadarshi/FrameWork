package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxStatus 
{
static
{
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
}
	public static void main(String[] args) throws InterruptedException 
	{
     WebDriver driver=new ChromeDriver();
     driver.get("https://demo.actitime.com/login.do");
     Thread.sleep(3000);
     boolean checkbox = driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
     Thread.sleep(3000);
     if(checkbox==true)
    	 System.out.println("checkbox is checked");
     else
    	 System.out.println("checkbox is unchecked");
     Thread.sleep(3000);
     
	}

}
