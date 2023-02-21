import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirstProgram {

	public static void main(String[] args) {
		
		//Invoking browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nilima\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.geeksforgeeks.org/how-to-open-chrome-browser-using-selenium-in-java/");
		//driver.navigate().to("https://www.qaacharya.in/2022/01/test-cases-for-zip-code-field-zip-code.html");
		System.out.println(driver.getTitle());
		//driver.close();
	}

}
