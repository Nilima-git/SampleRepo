package TestNG;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class Demo5 
{
	@Test(enabled=false)
	public void TC1()             //Test Case/Method
	{
		Reporter.log("Running TC1",true);
	}
	@Test
	public void TC2()             //Test Case/Method
	{
		Reporter.log("Running TC2",true);
	}
	@Test
	public void TC3()             //Test Case/Method
	{
		Reporter.log("Running TC3",true);
	}
	@Test
	public void TC4()             //Test Case/Method
	{
		Reporter.log("Running TC4",true);
	}
	
		
}

