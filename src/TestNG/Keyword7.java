package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword7 
{

	@Test                              //Test Case/method
	public void TC1() 
	{
		Reporter.log("Running Method TC1", true);
	}
	
	@Test(enabled=false)                             //Test Case/method
	public void TC2() 
	{
		Reporter.log("Running Method TC2", true);
	}
	
	
	
	
	
	
	
	
	
	
}