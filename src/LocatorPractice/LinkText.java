package LocatorPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Note: the locator ‘linkText’ can be used only if the element is a link
				(tag of the element should be <a>) 
*/
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Nilima\\\\webdriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.actitime.com/");
		
		driver.findElement(By.linkText("Get Through Tough Times in Business with actiTIME >>")).click();
		driver.close();
		//driver.quit();
	}

}
