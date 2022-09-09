																											package qsp;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateSuggestion1 
{
   static
   {
	   System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
   }
	public static void main(String[] args) throws InterruptedException 
	{
		//open the browser
     WebDriver driver=new ChromeDriver();
     //go to google.com
     driver.get("https://www.google.com/");
     //Type java in search box
     driver.findElement(By.name("q")).sendKeys("java");
     Thread.sleep(2000);
     //Find all the autoSuggestions and print the count 
     List<WebElement> allSugg=driver.findElements(By.xpath("//span[contains(text(),'java')]"));
     int count=allSugg.size();
     System.out.println(count);
     //print the text of all suggestion
     for(int i=0;i<count;i++)
     {
    	 String text=allSugg.get(i).getText();
    	 System.out.println(text);
     }
     //select the first autoSuggestion
     allSugg.get(2).click();
     driver.close();
	}
}
