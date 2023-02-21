
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 
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
	       driver.get("https://demo.automationtesting.in/Frames.html");
	       
	       //Wait
	       Thread.sleep(2000);
	       
	     //Step-I: Identify element and Store it into an object 
	   WebElement  dropdown=driver.findElement(By.xpath("//a[text()='SwitchTo']"));
	   
	   //Step-II:Create object of Actions Class
	        Actions act=new Actions(driver);
	   
	    //Step-III:Call the method (Move Curser) 
	      act.moveToElement(dropdown).perform();
	        
	      //Wait
	       Thread.sleep(2000);
	         
	       //Click windows option
	  driver.findElement(By.xpath("//a[text()='Windows']")).click();
	        
	        
	        
	        
		            
	}
	
	
	
	
	
	
	
	
	
	
	
	
}