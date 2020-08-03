package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class EventPromotionSteps {
	WebDriver driver;
	LoginPage loginPage;
	DashboardPage dashboardpage;

	@Before
	public void startFirst() {
		driver = BrowserFactory.startBrowserStage();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		dashboardpage = PageFactory.initElements(driver, DashboardPage.class);

	}

	@Given("^a user with username \"([^\"]*)\" and password \"([^\"]*)\" already logged in on website$")
	public void a_user_with_username_and_password_already_logged_in_on_website(String arg1, String arg2)
			throws InterruptedException {

		loginPage.login(arg1, arg2);
	}

	@When("^user navigate to Marketing -> Event Promotion$")
	public void user_navigate_to_Marketing_Event_Promotion() throws InterruptedException {
		dashboardpage.login();

	}

	@Then("^Event Promotions page shows up$")
	public void event_Promotions_page_shows_up() {
	}

	@When("^user clicks Create Promotion$")
	public void user_clicks_Create_Promotion() {
	}

	@Then("^Create Event Promotion page$")
	public void create_Event_Promotion_page() {
	}

	@Then("^Event details will be provided$")
	public void event_details_will_be_provided() {
	}

	@After
	public void close() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
		driver.quit();

	}
}
