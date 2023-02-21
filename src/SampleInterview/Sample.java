package SampleInterview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Nilima\\\\webdriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String ActualTitle = driver.getTitle();
		
		//Open google.com and verify whether the title is Google or not?
		
		if(ActualTitle.equalsIgnoreCase("google"))
		{
			System.out.println("Matching");
		}
		else
		{
			System.out.println("Not Matching");
		}
		
		String ActualURL= driver.getCurrentUrl();
		if(ActualURL.contains("com"))
		{
			System.out.println("its present");
		}
		else {
			System.out.println("its not present");
		}

	}

}
