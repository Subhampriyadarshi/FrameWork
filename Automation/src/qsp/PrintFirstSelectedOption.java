package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintFirstSelectedOption
{
  static
  {
	  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
  }
  
	public static void main(String[] args) throws InterruptedException 
	{
     WebDriver driver=new ChromeDriver();
     driver.get("file:///C:/Users/Admin/Desktop/seleneum/Hotel.html");
     WebElement checkPostListBox=driver.findElement(By.id("cp"));
     Thread.sleep(1000);
     Select s=new Select(checkPostListBox);
     Thread.sleep(1000);
     WebElement fSOption=s.getFirstSelectedOption();
     Thread.sleep(1000);
     String text=fSOption.getText();
     System.out.println(text);
     driver.close();
	}

}
