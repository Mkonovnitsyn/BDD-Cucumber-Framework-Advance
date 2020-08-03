package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.LoginPage;
import util.BrowserFactory;

public class LoginSteps {
	WebDriver driver;
	LoginPage loginPage; 
	BrowserFactory browserfactory; 
	String username = "";
	String password = "";

	@Before
	public void startFirst() {
		//driver = BrowserFactory.startBrowser();
		driver = BrowserFactory.startBrowserStage();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		browserfactory = PageFactory.initElements(driver, BrowserFactory.class);
	}

	

	@Given("^a valid user$")
	public void a_valid_user() {

		username = "support";
		password = "l2w0OoJCmjwS@0jT";

	}

	@When("^user goes to the site$")
	public void user_goes_to_the_site() {
		//driver = BrowserFactory.startBrowser();

	}

	@Then("^login page should display$")
	public void login_page_should_display() {
		
		String expectedTitle = "Sonny's Controls | Login";
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		String actualTitle = loginpage.getPageTitle();
		Assert.assertEquals("Title did not match", expectedTitle, actualTitle);
	}

	@When("^user enters valid username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_enters_valid_username_and_password(String arg1, String arg2) throws InterruptedException  {

	loginPage.login(username, password);
	
	}
	
   

	@Then("^Dashboard page should display$")
	public void dashboard_page_should_display() {
		String expectedTitle = "Sonny's Controls";
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		String actualTitle = loginpage.getPageTitle();
		Assert.assertEquals("Title did not match", expectedTitle, actualTitle);
	}
		@After
		public void close() throws InterruptedException {
			Thread.sleep(2000);
			driver.close();
			driver.quit();
		}
	
	}


