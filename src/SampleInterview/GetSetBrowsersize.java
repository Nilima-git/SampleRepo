package SampleInterview;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSetBrowsersize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Nilima\\\\webdriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		Dimension newDimension = new Dimension(800, 600);
		driver.manage().window().setSize(newDimension);
		
		System.out.println(driver.manage().window().getSize());
		
		

	}

}
