package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	// global variable
	static WebDriver driver;

	public static WebDriver startBrowser() {

		// Chrome Driver Properties
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		// ChromeDriver object
		WebDriver driver = new ChromeDriver();

		// Delete all cookies
		driver.manage().deleteAllCookies();

		// Maximize the browser window
		driver.manage().window().maximize();

		// Set implicit wait of 10 seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Launch Chrome browser and go to site
		driver.get("http://techfios.com/test/107/");

		// return the driver to the test class
		return driver;
	}
}
