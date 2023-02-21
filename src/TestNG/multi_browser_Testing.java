package TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class multi_browser_Testing 
{
   @Parameters("browserName")   //Chrome   firefox
	
@Test                             
public void TC1(String browserName) throws InterruptedException   //Chrome  firefox
	{
	      WebDriver driver=null;
		   // Chrome       //Chrome
	   if(browserName.equals("Chrome")) 
	   {	   
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nilima\\Documents\\chromedriver.exe");

	    driver=new ChromeDriver();       
	   }
             //firefox           //firefox
	   else if(browserName.equals("firefox")) 
	   {
		   
		   System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nilima\\Documents\\Browser\\geckodriver.exe");  
	    driver=new FirefoxDriver();
	   }   

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
             
       //Wait
       Thread.sleep(1000); 
       
	   driver.close();
	   
	}
	
}
