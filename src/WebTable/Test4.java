package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 
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
	       driver.get("file:///F:\\velocity\\automation\\WebTable/Table1.html");
	       
	       driver.manage().window().maximize();
	       
	       //Wait
	       Thread.sleep(2000);
	       
	       //Fetch "300"
	       
	    WebElement   S1=driver.findElement(By.xpath("//table[@id='1234']//tr[4]/td[3]"));  //300
	       
	       
	                  String   S2=S1.getText();  //"300"
	       
	                  System.out.println(S2);
	}
	
	
	
	
	
	
	
	
	
	
	

}