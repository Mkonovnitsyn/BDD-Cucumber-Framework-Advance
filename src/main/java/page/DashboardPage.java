package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

import util.BrowserFactory;


public class DashboardPage {
	WebDriver driver;
	BrowserFactory browserfactory; 

	// Every Page must have a constructor to invite the driver
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Element Library
	@FindBy(how = How.XPATH, using = "//*[@id=\"btn-mobile-menu-toggle\"]/i[1]")
	WebElement SideButton;
	@FindBy(how = How.LINK_TEXT, using = "#sidebar-dropdown-marketing")
	WebElement Marketing;
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Promotions")
	WebElement Promotions;
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Discounts")
	WebElement Discounts;

	// Methods to interact with the elements
	public void login() throws InterruptedException {
		ExpectedConditions.visibilityOf(SideButton);
		SideButton.click();
		Thread.sleep(1000);
		Marketing.click();
		Thread.sleep(1000);
		Promotions.click();
		Thread.sleep(1000);
		Discounts.click();
		Thread.sleep(1000);

	}

}
