package qsp;

import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//using treeSet interface 
public class AlphabaticalOrder1 
{
 static
 {
	 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
 }
	public static void main(String[] args) 
	{
      TreeSet<String> ts=new TreeSet<String>();
      WebDriver driver=new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
      driver.get("file:///C:/Users/Admin/Desktop/seleneum/Hotel.html");
      WebElement mtrListBox=driver.findElement(By.id("mtr"));
      Select s=new Select(mtrListBox);
      List<WebElement> allOpt=s.getOptions();
      int count=allOpt.size();
      System.out.println(count);
      for (WebElement we : allOpt)
      {                                  //   for(int i=0;i<count;i++)   
		String text=we.getText();        //     {
		ts.add(text);                    //     String text=allOpt.get(i).getText();
	  }                                  //     ts.add(text); 
      for(String text : ts)              //     }   
      {
    	  System.out.println(text);
      }
      
      driver.close(); 
	}

}
