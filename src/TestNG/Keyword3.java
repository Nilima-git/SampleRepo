package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword3 
{
	
	@Test(priority=2)                              //Test Case/method
	public void TC1() 
	{
		Reporter.log("Running Method TC1", true);
	}
	
	@Test(priority=1)                               //Test Case/method
	public void TC2() 
	{
		Reporter.log("Running Method TC2", true);
	}
	
	
	@Test             //by default priority=0                          //Test Case/method
	public void TC3() 
	{
		Reporter.log("Running Method TC3", true);
	}
	
	
	
	
	
	
	
	

}