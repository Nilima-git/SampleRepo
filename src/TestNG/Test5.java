package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test5
{

	
	@Test                                //Test Case/method
	public void TC1() 
	{
		
		String ActualResult=null;
		
		Assert.assertNull(ActualResult);
	
	}
	
	
	
	@Test                                //Test Case/method
	public void TC2() 
	{
		
		String ActualResult="Virat";
		
		Assert.assertNull(ActualResult);
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
}