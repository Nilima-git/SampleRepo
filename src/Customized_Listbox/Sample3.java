package Customized_Listbox;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample3 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		//Step-I:
		//Parameter-I: Name of the Browser
		//Parameter-II:Path of ChromeDriver.exe file
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nilima\\Documents\\chromedriver.exe");

	//Step-II:Create object of ChromeDriver class by providing reference of WebDriver(Interface)
	       WebDriver driver=new ChromeDriver();        //Upcasting
	                
	       
	       //To Enter URL/Open an Application
	     driver.get("https://www.facebook.com/");
	     
	     //Wait
	     Thread.sleep(2000);
	     
	     
	   //Click create new Account Button
	    driver.findElement(By.xpath("//a[text()='Create new account']")).click(); 
	     
	     //Wait
	     Thread.sleep(2000);
	     
	     //Step-I: Identify element and Store it into an object  
	      WebElement  DOB=driver.findElement(By.id("day"));
	     
	     
	    //Step-II:Create object of Actions Class
	        Actions act=new Actions(driver);
	       
	     //Step-III:Call the method 
	        act.click(DOB).perform();
	    
	        //Wait
		     Thread.sleep(2000);
	        
	      //To reach to the Top
	        act.sendKeys(Keys.HOME).perform();   // 1
	      
	      //Wait
		    Thread.sleep(2000);
	        
	        
	      for(int i=1;   i<=24;   i++) 
	      {
	    	  act.sendKeys(Keys.ARROW_DOWN).perform();  //25
	      }
	      
	      //Wait 
	      Thread.sleep(2000);
	      
	      //to select option
	      act.sendKeys(Keys.ENTER).perform();
	      
	      
	      
	}
	
	
	
	
	
	
	
}