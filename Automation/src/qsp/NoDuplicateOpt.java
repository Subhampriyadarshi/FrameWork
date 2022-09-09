package qsp;

import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NoDuplicateOpt 
{
   static
   {
	   System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
   }
	public static void main(String[] args) 
	{
	 HashSet<String> hs=new HashSet<String>();	
     WebDriver driver=new ChromeDriver();
     
     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
     
     driver.get("file:///C:/Users/Admin/Desktop/seleneum/Hotel.html");
     WebElement mtrListBox=driver.findElement(By.id("mtr"));
     
     Select s=new Select(mtrListBox);
     List<WebElement> allOpt=s.getOptions();
     int count=allOpt.size();
     System.out.println(count);
     for(int i=0;i<count;i++)
     {
    	 String text=allOpt.get(i).getText();
    	 hs.add(text);
     }
     /*for (WebElement we : allOpt) 
     {
		String text=we.getText();
		hs.add(text);
		System.out.println(text);
	 }*/ 
    for(String text : hs)
     {
    	 System.out.println(text);
     }
     driver.close();
	}
}
/* in hashSet we can't use normal for loop for ascending order since
 * it does't preserve the insertion order and we can't use index value, 
 * whereas in arrayList we can use normal for loop 
 */