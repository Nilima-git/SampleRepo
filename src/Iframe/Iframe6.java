package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe6 
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
	       driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	       
	       //Wait
	       Thread.sleep(2000);
	       
	       //to switch to Iframe (String Framename)
	       driver.switchTo().frame("iframeResult");

	       //Wait
	       Thread.sleep(2000);

	       
	       //Click me to display date and Time Button
	       driver.findElement(By.xpath("//button[@type='button']")).click();
	       
	     //Wait
	       Thread.sleep(2000);
	       
	       
	       //To switch to Main page   
	       driver.switchTo().defaultContent();
	       
	       
	       //Wait
	       Thread.sleep(2000);
	       
	       
	       //Click Home Link
	       driver.findElement(By.xpath("//a[@id='tryhome']")).click();
	       
	       
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}