package qsp;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup 
{
  static
  {
	  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
  }
	public static void main(String[] args) 
	{
       WebDriver driver=new ChromeDriver();
       driver.get("file:///C:/Users/Admin/Desktop/seleneum/Naukri.html");
       
       //convert the relative path to absolute path
       File f=new File("./data/Resume.docx");
       String absolutePath=f.getAbsolutePath();
       
       //pass the absolute path as an argument for sendKeys method 
       driver.findElement(By.id("cv")).sendKeys(absolutePath);
	}
}
