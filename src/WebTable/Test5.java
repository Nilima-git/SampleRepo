package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
	       driver.get("file:///F:\\velocity\\automation\\WebTable/Table1.html");
	       
	       driver.manage().window().maximize();
	       
	       //Wait
	       Thread.sleep(2000);
	       
	       //Fetch all data from Particular Row

	            //i=1       1<=3       2
	                       //2<=3      3
	                      //3<=3       4
	                     //4<=3
	       for(int i=1;     i<=3;     i++)
	       {
	    	                                                                            //3
	    	  WebElement S1=driver.findElement(By.xpath("//table[@id='1234']//tr[2]/td["+i+"]"));  //100
	    	                                      //LHS(String)  "+i+"  RHS(String)
	    	   
	    	   
	    	            String text=S1.getText();  //"100"
	    	  
	    	           System.out.println(text);  //1    manual   100
	       }
	       
	       
	       
	       
	       
	       
	       
	       
	       
	      
	       
	       
	       
	    
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}