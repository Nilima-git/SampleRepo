package Handling_of_Dynamic_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 
{
    //Handling_of_Dynamic_element
	public static void main(String[] args) throws InterruptedException 
	{
		//Step-I:
		//Parameter-I: Name of the Browser
		//Parameter-II:Path of ChromeDriver.exe file
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nilima\\webdriver\\chromedriver.exe");

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
	       
	    //Enter "redmi note 10s" 
	       driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("redmi note 10s");
	       
	       //Wait
	       Thread.sleep(2000);
	       
	      //Click search Button
	       driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	      
	       //Wait
	       Thread.sleep(2000);
	       
	       //identify rating element
	      WebElement Rating=driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[6]"));
	       
	      //Wait
	       Thread.sleep(2000);
	      
	       //To get text of an element
	         String  S1=Rating.getText();
	       
	         System.out.println(S1);
	         
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}