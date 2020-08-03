package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class allWaits {
	
	WebDriver driver; 
	
	public void sleep () throws InterruptedException {
		Thread.sleep(3000);
	}
	
	public void smartwait () {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void waitforelement () {
		//WebDriverWait wait = new WebDriverWait(driver,15);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath);		
	}
	
	
	}


