package POM_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Insurance_Broker_Insurance_Webpage 
{
	
	//POM-II
	
//1. Data members/Global Variables should be declared globally with access level private by using @findby Annotation
	
	@FindBy(xpath="//h4[text()='saradeg41@gmail.com']")  private  WebElement Signedinas;  //private WebElement Signedinas=driver.findElement(by.xpath("//h4[text()='saradeg41@gmail.com']"));
	                                  
	@FindBy(xpath="//input[@class='btn btn-danger']")   private  WebElement  LogoutBtn;  //private WebElement LogoutBtn=driver.findElement(by.xpath("//input[@class='btn btn-danger']"));
	

	//2. Initialize within a constructor with access level public using pagefactory
	
	public Insurance_Broker_Insurance_Webpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//3. Utilize within a method with access level public

	public void VerifyEmailAddress(String ExpectedEmail)  //saradeg411@gmail.com
	{
		String ActualEmail=Signedinas.getText(); //saradeg41@gmail.com
		
		if(ExpectedEmail.equals(ActualEmail)) 
		{
			System.out.println("Pass");
		}
		else 
		{
			System.out.println("Fail");
		}
		
		
	}
	
	public void ClickLogoutBtn() 
	{
		LogoutBtn.click();
	}
	
}