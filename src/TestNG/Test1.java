package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 
{
	
	
	@Test                                //Test Case/method
	public void TC1() 
	{
		String ExpectedResult="Hi";
		
		String ActualResult="Hi";
		
		Assert.assertEquals(ActualResult, ExpectedResult);  //Hi  Hi
	}
	
	
	@Test                                //Test Case/method
	public void TC2() 
	{
		String ExpectedResult="Hello";
		
		String ActualResult="Hi";
		
		Assert.assertEquals(ActualResult, ExpectedResult);  //Hi  Hello
	}
	
	
	
	
	

}