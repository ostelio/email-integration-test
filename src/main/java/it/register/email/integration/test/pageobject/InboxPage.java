package it.register.email.integration.test.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InboxPage {

	@FindBy(how = How.ID, using = "io-ox-top-logo-small")
	private WebElement logo;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/ul[2]/li[3]/a")
	private WebElement settings;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/ul[2]/li[3]/ul/li[11]/a")
	private WebElement lougoutButton;

	public void waitForLoading(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(logo));
	}

	public boolean isDisplayedCheck() {
		return logo.isDisplayed();
	}
	
	public void logout(){
		settings.click();
		lougoutButton.click();
	}
}
