package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Un_Psw_Lngth_Wdth 
{ 
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args)
	{
    WebDriver driver=new ChromeDriver();
    driver.get("https://demo.actitime.com/");
    WebElement h1=driver.findElement(By.id("username"));
    int height1=h1.getSize().getHeight();
    WebElement w1=driver.findElement(By.id("username"));
    int width1=w1.getSize().getWidth();
    WebElement h2=driver.findElement(By.name("pwd"));
    int height2=h2.getSize().getHeight();
    WebElement w2=driver.findElement(By.name("pwd"));
    int width2=w2.getSize().getWidth();
    if(height1==height2 && width1==width2)
    	System.out.println("height and width of UN and PSD is equal");
    else
    	System.out.println("height and width of UN and PSD is not equal");
	}

}
