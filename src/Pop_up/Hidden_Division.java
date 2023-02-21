package Pop_up;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Division 
{

	  //Hidden division pop-up
		public static void main(String[] args) throws InterruptedException, IOException 
		{
			//Step-I:
			//Parameter-I: Name of the Browser
			//Parameter-II:Path of ChromeDriver.exe file
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nilima\\Documents\\chromedriver.exe");

		//Step-II:Create object of ChromeDriver class by providing reference of WebDriver(Interface)
		       WebDriver driver=new ChromeDriver();        //Upcasting
		                
		       
		       //To Enter URL/Open an Application
		     driver.get("https://www.flipkart.com/");
		     
		    //wait
		     Thread.sleep(2000);
		     
		    //Enter Email/mobile No
		     driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("abc123@gmail.com");
		     
			    //wait
		     Thread.sleep(2000);
		     
		     //Click Request OTP Button
		     driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
		     
		     
		}
	
	
	
	
	
	
	
	
	
	
}