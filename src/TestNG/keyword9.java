package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class keyword9 
{
	
	@Test                             //Test Case/method
	public void Login() 
	{
		Reporter.log("Running Login TC", true);
	}
	
	
	@Test(dependsOnMethods= {"Login"})                               //Test Case/method
	public void Logout() 
	{
		Reporter.log("Running Logout TC", true);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}