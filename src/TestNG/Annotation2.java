package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation2 
{
	
	@BeforeClass
	public void OpenBrowser() 
	{
		Reporter.log("Open Browser", true);
	}
	
	
	@BeforeMethod
	public void loginToApp() 
	{
		Reporter.log("login To App", true);
	}
	
	@Test                                 //Test Case/method
	public void TC1() 
	{		
		Reporter.log("Running Method TC1", true);
	}

	@Test                                 //Test Case/method
	public void TC2() 
	{		
		Reporter.log("Running Method TC2", true);
	}
	

	@AfterMethod
	public void LogoutFromApp() 
	{
		Reporter.log("logout from App", true);
	}
	
	@AfterClass
	public void CloseBrowser() 
	{
		Reporter.log("Close Browser", true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}