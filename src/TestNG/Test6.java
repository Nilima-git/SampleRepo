package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test6 
{
	
	@Test                                //Test Case/method
	public void TC1() 
	{
		
		String ActualResult="Virat";
		
		Assert.assertNotNull(ActualResult);
	
	}
	
	@Test                                //Test Case/method
	public void TC2() 
	{
		
		String ActualResult=null;
		
		Assert.assertNotNull(ActualResult);
	
	}
	
	
	

}