package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Insurance_Login 
{

	//POM-I
	
//1. Data members/Global Variables should be declared globally with access level private by using @findby Annotation
	
	@FindBy(xpath="//input[@id='email']")  private  WebElement Email;
	
	@FindBy(xpath="//input[@id='password']")  private  WebElement Password;
	
	@FindBy(xpath="//input[@name='submit']")   private   WebElement Loginbtn;
	                                       
	
	
	//2. Initialize within a constructor with access level public using pagefactory

	public Insurance_Login(WebDriver driver)
	{
		PageFactory.initElements(driver , this);
	}
	
	
	
	                                       
}