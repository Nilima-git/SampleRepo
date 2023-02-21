package POM_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insurance_TestClass 
{
	
	
	public static void main(String[] args)  throws InterruptedException, EncryptedDocumentException, IOException 
	{
		//Step-I:
		//Parameter-I: Name of the Browser
		//Parameter-II:Path of ChromeDriver.exe file
				
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nilima\\Documents\\chromedriver.exe");

		//Step-II:Create object of ChromeDriver class by providing reference of WebDriver(Interface)
		WebDriver driver=new ChromeDriver();        //Upcasting
			               
			       
		//To Enter URL
		driver.get("https://demo.guru99.com/insurance/v1/index.php");
			
		driver.manage().window().maximize();
		
		//Wait
		Thread.sleep(2000);
		
	       //to Read data from Excelsheet
		FileInputStream file=new  FileInputStream("F:\\velocity\\automation\\1_Oct_A_Morning.xlsx");     
		Sheet Sh = WorkbookFactory.create(file).getSheet("Sheet9");
		  
		
		 //Create Object Of POM-I Class
		Insurance_Login Login=new Insurance_Login(driver);
		
		//Enter Email
		String EM=Sh.getRow(0).getCell(0).getStringCellValue();  //saradeg41@gmail.com
		Login.EnterEmail(EM); //saradeg41@gmail.com
		
		
		
		//Wait
		Thread.sleep(2000);
		
		//Enter Password
		String PSW=Sh.getRow(1).getCell(0).getStringCellValue(); //Sai@1117
		Login.EnterPassowrd(PSW);  //Sai@1117     
			       
		
		//Wait
		Thread.sleep(2000);
		
		
		//Click login Button
		Login.ClickLoginBtn();
		
		
		//Create object of POM-II Class
        Insurance_Broker_Insurance_Webpage Broker=new Insurance_Broker_Insurance_Webpage(driver);
			       
			
        //To get Expected Result
       String  Expected=Sh.getRow(2).getCell(0).getStringCellValue(); //saradeg41@gmail.com
       Broker.VerifyEmailAddress(Expected);
		
       
        //Wait
       Thread.sleep(2000);

       
       //Click Logout Button
       Broker.ClickLogoutBtn();
       
	}	

}