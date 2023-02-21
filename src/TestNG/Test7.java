package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test7 
{
	//drawbacks of Assert class
	@Test                                //Test Case/method
	public void TC1() 
	{

		String S1="Hi";
		
		String S2="Hello";
		
		String S3="Good Morning";
		
		Assert.assertNotEquals(S2, S1);  //ActalResult  ExpectedResult-->Pass
		
		Assert.assertEquals(S2, S1);  //ActalResult  ExpectedResult-->Fail
		
		Assert.assertEquals(S3, S1);  //ActalResult  ExpectedResult-->fail
		
		Assert.assertNotEquals(S1, S3); //ActalResult  ExpectedResult-->pass
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}