package com.br.keeggo.Code.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageMap {
	
	private WebDriver driver;
	
	protected String messageInvalidUser = "Incorrect user name or password.";
	protected String messageBlockedUser = "User is temporary blocked from login";
	
	@FindBy(linkText = "CREATE NEW ACCOUNT")
	protected WebElement lnkNewAccount;
	
	@FindBy(name = "username")
	protected WebElement lblUsername;
	
	@FindBy(name = "password")
	protected WebElement lblPassword;
	
	@FindBy(id = "sign_in_btnundefined")
	protected WebElement btnSignIn;
	
	@FindBy(linkText = "SIGN IN WITH FACEBOOK")
	protected WebElement btnSigninFacebook;
	
	@FindBy(id = "signInResultMessage")
	protected WebElement txtInvalidUserorPassword;

	protected void LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
