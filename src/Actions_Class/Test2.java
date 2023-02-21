package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test2 
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
	       driver.get("https://www.flipkart.com/");
	       
	       driver.manage().window().maximize();
	       
	       //Wait
	       Thread.sleep(2000);
	       
	       //Close Hidden division pop-up
	       driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	       
	       //Wait
	       Thread.sleep(2000);
	       
	     //Step-I: Identify element and Store it into an object 
	     WebElement  cart=driver.findElement(By.xpath("//a[@class='_3SkBxJ']"));
	       
	   //Step-II:Create object of Actions Class
	        Actions act=new Actions(driver);
	          
	        //Step-III:Call the method (Right Click)   
	        act.contextClick(cart).perform();
	}
	
	
	
	
	
	
	
	
	

}