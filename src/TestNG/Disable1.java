package TestNG;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class Disable1 
{	
	@Test                               //Test Case/method
	public void TC1() 
	{
		Reporter.log("Running TC1", true);
	}		
	@Test                                //Test Case/method
	public void TC2() 
	{
		Reporter.log("Running TC2", true);
	}	
	@Test                                //Test Case/method
	public void TC3() 
	{
		Reporter.log("Running TC3", true);
	}
	@Test                                //Test Case/method
	public void TC4() 
	{
		Reporter.log("Running TC4", true);
	}
	
		
}

