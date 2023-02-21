package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword1 
{
    //To Run Multiple times
	
	@Test(invocationCount=10)                                 //Test Case/method
	public void TC1() 
	{
		
		Reporter.log("Running Method TC1", true);
	}
	
	
	
	
	
	
}