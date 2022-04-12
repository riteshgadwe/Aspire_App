package Home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Commons {
public static WebDriver getChromeDriver() {
	System.out.println("Welcome To Login Page");
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe"); 
	WebDriver driver = new ChromeDriver();
	return driver;
}
}
