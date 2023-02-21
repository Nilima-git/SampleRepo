package SampleInterview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Nilima\\\\webdriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		//How do you maximize the browser in Selenium?

		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		

	}

}
