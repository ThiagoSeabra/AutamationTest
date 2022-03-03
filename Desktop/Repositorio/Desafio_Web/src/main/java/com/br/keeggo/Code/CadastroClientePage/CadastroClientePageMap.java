package com.br.keeggo.Code.CadastroClientePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CadastroClientePageMap {
	
	private WebDriver driver;
	
	@FindBy(name = "usernameRegisterPage")
	protected WebElement lblUserName;
	
	@FindBy(name = "emailRegisterPage")
	protected WebElement lblEmail;
	
	@FindBy(name = "passwordRegisterPage")
	public WebElement lblPassword;
	
	@FindBy(name = "confirm_passwordRegisterPage")
	protected WebElement lblConfirmPassword;
	
	@FindBy(name = "first_nameRegisterPage")
	protected WebElement lblFirstName;
	
	@FindBy(name = "last_nameRegisterPage")
	protected WebElement lblLastName;
	
	@FindBy(name = "phone_numberRegisterPage")
	protected WebElement lblPhoneNumber;
	
	@FindBy(name = "countryListboxRegisterPage")
	protected WebElement lstContry;
	
	@FindBy(name = "cityRegisterPage")
	protected WebElement lblCity;
	
	@FindBy(name = "addressRegisterPage")
	protected WebElement lblAdress;
	
	@FindBy(name = "state_/_province_/_regionRegisterPage")
	protected WebElement lblState;
	
	@FindBy(name = "postal_codeRegisterPage")
	protected WebElement lblPostalCode;
	
	@FindBy(name = "i_agree")
	protected WebElement chkAgreeConditions;
	
	@FindBy(id = "register_btnundefined")
	protected WebElement btnRegister;
	
	@FindBy(xpath = "//*[@id=\"formCover\"]/div[1]/div[1]/sec-view[1]/div/label")
	protected WebElement txtUserNameErrorMessage;
	
	@FindBy(xpath = "//*[@id=\"formCover\"]/div[1]/div[1]/sec-view[2]/div/label")
	protected WebElement txtEmailErrorMessage;
	
	@FindBy(xpath = "//*[@id=\"formCover\"]/div[1]/div[2]/sec-view[1]/div/label")
	protected WebElement txtPasswordErrorMessage;
	
	@FindBy(xpath = "//*[@id=\"formCover\"]/div[1]/div[2]/sec-view[2]/div/label")
	protected WebElement txtConfirmPasswordErrorMessage;

	protected void CadastroClientePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
