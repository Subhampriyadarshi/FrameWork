package qsp;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//use short without treeSet
public class AlphabaticalOrder
{
   static
   {
	   System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
   }
	public static void main(String[] args) 
	{
     ArrayList<String> al=new ArrayList<String>(); 		
     WebDriver driver=new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
     driver.get("file:///C:/Users/Admin/Desktop/seleneum/Hotel.html");
     WebElement mtrList=driver.findElement(By.id("mtr"));
     Select s=new Select(mtrList);
     List<WebElement> allOpt=s.getOptions();
     for (WebElement we : allOpt) 
     {
		String text=we.getText();
		al.add(text);
	 }
     Collections.sort(al);
     System.out.println(al);
     
     //to print vertically
     for (String text : al)         
     {
		System.out.println(text);
	 }
     /*for(int i=0;i<al.size();i++)
      * {
      *   System.out.println(al.get(i));
      * }
      */
     driver.close();
	}
}
/* in hashSet we can't use normal for loop for ascending order since
 * it does't preserve the insertion order and we can't use index value, 
 * whereas in arrayList we can use normal for loop 
 */
