package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Alignmnt_Radiobutton_Fb 
{
  static
  {
	  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
  }
	public static void main(String[] args) throws InterruptedException 
	{
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.facebook.com/");
      driver.findElement(By.linkText("Create New Account")).click();
      Thread.sleep(2000);
      int y1=driver.findElement(By.xpath("(//input[@type='radio'])[1]")).getLocation().getY();
      int y2=driver.findElement(By.xpath("(//input[@type='radio'])[2]")).getLocation().getY();
      int y3=driver.findElement(By.xpath("(//input[@type='radio'])[3]")).getLocation().getY();
      if(y1==y2 && y1==y3)
    	  System.out.println("Gender radio buttons are properly aligned in the facebook page");
      else
    	  System.out.println("Gender radio buttons are not properly aligned in the facebook page");
     
      driver.close();
	}

}
