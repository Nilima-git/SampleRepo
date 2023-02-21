package Handling_of_Multiple_Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1
{
   //Handling_of_Multiple_Elements
	public static void main(String[] args) throws InterruptedException 
	{
		//Step-I:
		//Parameter-I: Name of the Browser
		//Parameter-II:Path of ChromeDriver.exe file
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nilima\\webdriver\\chromedriver.exe");

	//Step-II:Create object of ChromeDriver class by providing reference of WebDriver(Interface)
	       WebDriver driver=new ChromeDriver();        //Upcasting
	                  
	       
	       //To Enter URL
	       driver.get("https://www.facebook.com/");
	       
	       //Wait
	       Thread.sleep(2000);
	       
	       //To identify Links       
	  List<WebElement>   AllLinks=driver.findElements(By.xpath("//a"));   //46
	       
  
	        for(WebElement S1:AllLinks)  //Sign up Login groups
	        {
	        	System.out.println(S1.getText());   //Sign up   Login groups
	        }
	  
	       
	}
	
	
	
	
}