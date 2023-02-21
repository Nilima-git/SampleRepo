package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 
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
	       
	       //Fetch "Java"
	       
	    WebElement   S1=driver.findElement(By.xpath("//table[@id='1234']//tr[3]/td[2]"));
	       
	       
	                  String   S2=S1.getText();  //Java
	       
	                  System.out.println(S2);
	}
	
	
	
	
	
	
	
	
	
	
	
}