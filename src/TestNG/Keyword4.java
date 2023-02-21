package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword4 
{
	
	@Test(priority=2)                              //Test Case/method
	public void TC1() 
	{
		Reporter.log("Running Method TC1", true);  //4
	}
	
	@Test(priority=1)                               //Test Case/method
	public void TC2() 
	{
		Reporter.log("Running Method TC2", true);  //3
	}
	
	
	@Test             //by default priority=0                          //Test Case/method
	public void TC3() 
	{
		Reporter.log("Running Method TC3", true);  //1
	}
	
	
	@Test             //by default priority=0                          //Test Case/method
	public void TC4() 
	{
		Reporter.log("Running Method TC4", true); //2
	}
	
	
	
	
	
	

}