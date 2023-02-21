package Pop_up;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 
{
  //How to Handle Alert Pop-up
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		//Step-I:
		//Parameter-I: Name of the Browser
		//Parameter-II:Path of ChromeDriver.exe file
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nilima\\Documents\\chromedriver.exe");

	//Step-II:Create object of ChromeDriver class by providing reference of WebDriver(Interface)
	       WebDriver driver=new ChromeDriver();        //Upcasting
	                
	       
	       //To Enter URL/Open an Application
	     driver.get("https://demo.guru99.com/test/delete_customer.php");
	     
	    //wait
	     Thread.sleep(2000);
	     
	     //Enter CustomerID
	     driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("abc123");
	     
	   //wait
	     Thread.sleep(2000);
	     
	     //Click Submit Button
	     driver.findElement(By.xpath("//input[@name='submit']")).click();
	     
	     
	     //To switch to Alert    
	  Alert  Alt=driver.switchTo().alert();
	     
	  //wait
	    Thread.sleep(1000);
	  
	  
	     //Click OK Button
	     Alt.accept();
	  
	  
	     
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}