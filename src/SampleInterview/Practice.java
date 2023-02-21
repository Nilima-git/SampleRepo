package SampleInterview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Nilima\\\\webdriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.get("https://www.myntra.com/");
		//driver.navigate().back();
		//driver.close();
		System.out.println(driver.getPageSource());
		driver.quit();
	}

}
