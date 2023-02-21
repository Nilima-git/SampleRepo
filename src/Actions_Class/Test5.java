package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test5 
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
	       driver.get("https://demo.guru99.com/test/drag_drop.html");
	       
	       driver.manage().window().maximize();
	       
	       //Wait
	       Thread.sleep(2000);
	       
	     //Step-I: Identify element and Store it into an object   
	    WebElement  Source=driver.findElement(By.xpath("//a[text()=' 5000']"));      
	    WebElement   Destination=driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
	    
	    
	    //Step-II:Create object of Actions Class
        Actions act=new Actions(driver);
	    
	      //Step-III:Call the method  
        act.dragAndDrop(Source,Destination).perform();
        
        
	    
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}