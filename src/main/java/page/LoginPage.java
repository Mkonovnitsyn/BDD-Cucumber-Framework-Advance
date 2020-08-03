package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;

	// Every Page must have a constructor to invite the driver
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.ID, using ="login-username")
	WebElement Username;
	@FindBy(how = How.ID, using = "login-password")
	WebElement Password;
	@FindBy(how = How.XPATH, using = "//button[@type=\"submit\"]")
	WebElement LoginButton;

	// Methods to interact with the elements
	public void login(String UserName, String password) throws InterruptedException {
		Username.sendKeys(UserName);
		Thread.sleep(1000);
		Password.sendKeys(password);
		Thread.sleep(1000);
		LoginButton.click();
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

		
	}
