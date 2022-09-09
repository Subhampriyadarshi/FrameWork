package qsp;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSelectCheckboxByScanner 
{
   static
   {
	   System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
   }
	public static void main(String[] args) 
	{
	  System.out.println("Enter the url: ");
	  Scanner sc=new Scanner(System.in);
	  String url=sc.nextLine();
      WebDriver driver=new ChromeDriver();
      
      driver.get(url);
      driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
      List<WebElement> allCheck=driver.findElements(By.xpath("(//input[@type='checkbox'])"));
      int count=allCheck.size();
      System.out.println(count);
      for(int i=0;i<count;i++)
      {
    	  allCheck.get(i).click();
    	  System.out.println((i+1)+"st checkbox is checked and pass ");
      } 
	}
}
