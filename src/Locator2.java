import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nilima\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://degreed.com/account/login?returnUrl=%2Fplan%2F1675678");
		driver.findElement(By.id("username")).sendKeys("Nilimahande2@gmail.com");
	
		
		driver.findElement(By.name("password")).sendKeys("Nilima@123");
		driver.findElement(By.className("df-spinner-button__content")).click();

		//driver.findElement(By.className("df-spinner-button__content")).click();

	}

}
