package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test8 
{

	@Test                                //Test Case/method
	public void TC1() 
	{
       SoftAssert soft=new SoftAssert();
		
		String S1="Hi";
		
		String S2="Hello";
		
		String S3="Good Morning";
		
		
		soft.assertEquals(S2,S1);   //ActalResult  ExpectedResult-->Fail
		
		soft.assertNotEquals(S1, S2);  //ActalResult  ExpectedResult-->Pass
		
		soft.assertEquals(S1,S3);   //ActalResult  ExpectedResult-->Fail
		
		soft.assertNotEquals(S1, S3);  //ActalResult  ExpectedResult-->Pass
			
		soft.assertAll();
	}
	
}