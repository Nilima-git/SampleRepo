package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insurance_TestClass 
{
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		//Step-I:
		//Parameter-I: Name of the Browser
		//Parameter-II:Path of ChromeDriver.exe file
				
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nilima\\Documents\\chromedriver.exe");

		//Step-II:Create object of ChromeDriver class by providing reference of WebDriver(Interface)
		WebDriver driver=new ChromeDriver();        //Upcasting
			               
			       
		//To Enter URL
		driver.get("https://demo.guru99.com/insurance/v1/index.php");
			       
		//Wait
		Thread.sleep(2000);
			             
		
		 //Create Object Of POM-I Class
		Insurance_Login Login=new Insurance_Login(driver); 
			       
			       
			       
		//Create object of POM-II Class
        Insurance_Broker_Insurance_Webpage Broker=new Insurance_Broker_Insurance_Webpage(driver);
			       
			       
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}