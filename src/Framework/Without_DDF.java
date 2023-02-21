package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Without_DDF 
{
	 //Without_DDF 
	public static void main(String[] args) throws InterruptedException 
	{
		//Step-I:
		//Parameter-I: Name of the Browser
		//Parameter-II:Path of ChromeDriver.exe file
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Nilima\\\\webdriver\\\\chromedriver.exe");

	//Step-II:Create object of ChromeDriver class by providing reference of WebDriver(Interface)
	       WebDriver driver=new ChromeDriver();        //Upcasting
	               
	       
	       //To Enter URL
	       driver.get("https://demo.guru99.com/insurance/v1/index.php");
	       
	       //Wait
	       Thread.sleep(2000);
	             
	       //Enter Email
       driver.findElement(By.xpath("//input[@id='email']")).sendKeys("saradeg41@gmail.com");
	       
       //Wait
       Thread.sleep(1000); 
       
       //Enter Password
       driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Sai@1117");
       
       
       //Wait
       Thread.sleep(1000); 
       
       //Click Login Button
       driver.findElement(By.xpath("//input[@name='submit']")).click();
       
       //Wait
       Thread.sleep(2000); 
       
       
       
       //Test Case: Verify Email Address
       String ExpectedEmailAddress="saradeg41@gmail.com";
       
      WebElement S1=driver.findElement(By.xpath("//h4[text()='saradeg41@gmail.com']"));
       
          String  ActualEmailAddress=S1.getText(); //saradeg41@gmail.com
       
              
          if(ExpectedEmailAddress.equals(ActualEmailAddress))
          {
        	 System.out.println("Pass"); 
          }
          else 
          {
        	  System.out.println("Fail");
          }     
               
               
               
	}
	
	
	
	
	
	
	
	
	

}