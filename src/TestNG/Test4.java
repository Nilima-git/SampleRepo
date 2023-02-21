package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test4 
{
	
	
	@Test                                //Test Case/method
	public void TC1() 
	{
		
	   boolean	ActualResult=false;
		
		Assert.assertFalse(ActualResult);
	}
	
	
	@Test                                //Test Case/method
	public void TC2() 
	{
		
	   boolean	ActualResult=true;
		
		Assert.assertFalse(ActualResult);
	}
	
	
	
	
	
	

}