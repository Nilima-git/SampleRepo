package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Normal_Class 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nilima\\Documents\\chromedriver.exe");

		//Step-II:Create object of ChromeDriver class by providing reference of WebDriver(Interface)
		       WebDriver driver=new ChromeDriver();        //Upcasting
		               
		       
		       //To Enter URL
		       driver.get("https://www.facebook.com/");
		       
		       //Wait
		       Thread.sleep(2000);
		       
		
	
		
		
	}
	
	
	
	
	
	
	
	
	
}