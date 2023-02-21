package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestNG_Class 
{
	
	@Test                                           //Test Case/Method
	public void OpenFacebook() throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nilima\\Documents\\chromedriver.exe");

		//Step-II:Create object of ChromeDriver class by providing reference of WebDriver(Interface)
		       WebDriver driver=new ChromeDriver();        //Upcasting
		               
		       
		       //To Enter URL
		       driver.get("https://kite.zerodha.com/");
		       
		       //Wait
		       Thread.sleep(2000);
		       
		
		
		
	}
	
	
	
	
	
	

}