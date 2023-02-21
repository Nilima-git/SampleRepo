package Pop_up;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		//Step-I:
		//Parameter-I: Name of the Browser
		//Parameter-II:Path of ChromeDriver.exe file
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nilima\\Documents\\chromedriver.exe");

	//Step-II:Create object of ChromeDriver class by providing reference of WebDriver(Interface)
	       WebDriver driver=new ChromeDriver();        //Upcasting
	                
	       
	       //To Enter URL/Open an Application
	     driver.get("https://skpatro.github.io/demo/links/");
	     
	    //wait
	     Thread.sleep(2000);
	     
	     //Click New Tab Button
	     driver.findElement(By.xpath("//input[@name='NewTab']")).click();
	     
	     //wait
	     Thread.sleep(2000);
	     
	     
	     //to get IDs
	    Set<String> IDs=driver.getWindowHandles();   //mainpageID  //ChildwindowID  
	     System.out.println(IDs);
	     
	     
	     ArrayList<String> al=new ArrayList<String>(IDs); //mainpageID  //ChildwindowID 
	     
	     //to get MainpageID
	       String  MPID =al.get(0);    //MainpageID
	      System.out.println(MPID);
	    
	    //To get ChildwindowID 
	     String CWID=al.get(1);            // ChildwindowID
	    System.out.println(CWID);
	    
	    
	     
	     //To Switch to Window Pop-up
	     driver.switchTo().window(CWID);
	     
	     
	     //Click Training Link
	   driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();	     
	   
	     //wait
	     Thread.sleep(2000);     
	   
	     //To Switch to main page
	   driver.switchTo().window(MPID);

	     //wait
	     Thread.sleep(2000);
	     	   
	   //Click New Window Button
	   driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
	   
	   
	   
	   
	     
	}
	
	
	
	
	
	
	
	
	
	
	

}