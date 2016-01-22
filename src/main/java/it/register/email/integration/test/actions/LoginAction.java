package it.register.email.integration.test.actions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import it.register.common.pathfinder.base.Context;
import it.register.common.pathfinder.exception.IntegrationTestException;
import it.register.common.pathfinder.flow.BaseAction;
import it.register.email.integration.test.config.UserConfig;
import it.register.email.integration.test.pageobject.InboxPage;
import it.register.email.integration.test.pageobject.LoginPage;

public class LoginAction extends BaseAction {

	private WebDriver driver;
	private LoginPage loginPage;
	private InboxPage inboxPage;
	private UserConfig userconfig;
	
	
	@Override
	public Context execute(Context data) throws IntegrationTestException {
		this.init(data);
		
		driver.get("http://webmail-integration.register.it");
		Assert.assertTrue(loginPage.isDisplayedCheck());
		
		loginPage.fillAccount(userconfig.getUsername());
        loginPage.fillPassword(userconfig.getPassword());

        loginPage.doLogin();
						
        inboxPage.waitForLoading(driver);
        Assert.assertTrue(inboxPage.isDisplayedCheck());
        inboxPage.logout();
		
		return data;
	}

	private void init(Context data){
		driver = data.getWebDriver();
		loginPage = PageFactory.initElements(data.getWebDriver(), LoginPage.class);
		inboxPage = PageFactory.initElements(data.getWebDriver(), InboxPage.class);
		userconfig = new UserConfig();
	}
}
