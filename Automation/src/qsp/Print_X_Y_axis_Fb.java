package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_X_Y_axis_Fb 
{
static 
{
  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
}
public static void main(String[] args)
{
  WebDriver driver=new ChromeDriver();
  driver.get("https://www.facebook.com/");
  int x=driver.findElement(By.id("email")).getLocation().getX();
  int y=driver.findElement(By.id("email")).getLocation().getY();
  System.out.println("x-axis dimension of email textbox present in facebook is "+x);
  System.out.println("y-axis dimension of email textbox present in facebook is "+y);
  driver.close();
}
}
