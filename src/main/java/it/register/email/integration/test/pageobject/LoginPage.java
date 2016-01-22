package it.register.email.integration.test.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

    @FindBy(how = How.ID, using = "submit")
    private WebElement loginButton;

    @FindBy(how = How.NAME, using = "account")
    private WebElement accountInput;

    @FindBy(how = How.ID, using = "password")
    private WebElement passwordInput;

    public boolean isDisplayedCheck(){
    	return loginButton.isDisplayed();
    }

    public void fillAccount(String account){
        accountInput.sendKeys(account);
    }

    public void fillPassword(String password){
        passwordInput.sendKeys(password);
    }

    public void doLogin(){
        loginButton.click();
    }
}
