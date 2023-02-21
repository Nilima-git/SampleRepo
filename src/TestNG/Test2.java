package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 
{

	
	@Test                                //Test Case/method
	public void TC1() 
	{
		String ExpectedResult="Hello";
		
		String ActualResult="Hi";
		
		Assert.assertNotEquals(ActualResult,ExpectedResult); //Hi  Hello
	}
	
	@Test                                //Test Case/method
	public void TC2() 
	{
		String ExpectedResult="Hi";
		
		String ActualResult="Hi";
		
		Assert.assertNotEquals(ActualResult,ExpectedResult); //Hi  Hi
	}
	
	
	
	
	
	
	
}