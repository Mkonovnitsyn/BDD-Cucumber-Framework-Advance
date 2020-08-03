package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

	static WebDriver driver;

	public static WebDriver startBrowserQA() {
		// Set Chrome Driver Properties
		System.setProperty("webdriver.chrome.driver", "./driver_New/chromedriver.exe");
		// Create ChromeDriver object and launch chrome browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://tidalwavecarwash.qa.sonnyscontrols.com/login");
		// return the driver to the test class
		return driver;
	}
	
	public static WebDriver startBrowserStage() {
		// Set Chrome Driver Properties
		System.setProperty("webdriver.chrome.driver", "./driver_New/chromedriver.exe");
		// Create ChromeDriver object and launch chrome browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://tidalwavecarwash.stage.sonnyscontrols.com/login");
		// return the driver to the test class
		return driver;
	}
	
}
