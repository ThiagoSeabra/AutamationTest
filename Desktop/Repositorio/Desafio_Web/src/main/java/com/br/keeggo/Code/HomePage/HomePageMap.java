package com.br.keeggo.Code.HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageMap {
	
	private WebDriver driver;
	
	@FindBy(id = "menuUser")
	protected WebElement btnMenuUsuario;
	
	@FindBy(xpath = "//*[@id=\"menuUserLink\"]/span")
	protected WebElement lblUserLogado;

	@FindBy(xpath = "//*[@id=\"loginMiniTitle\"]/label[3]")
	protected WebElement lnkSignOut;
	
	@FindBy(id = "headphonesImg")
	protected WebElement cardHeadPhones;
	
	@FindBy(id = "searchSection")
	protected WebElement iconBuscaProd;
	
	@FindBy(id = "autoComplete")
	protected WebElement lblInformarProdutoTelaGrande;
	
	@FindBy(name = "mobile_search")
	protected WebElement lblInformarProdutoTelaPequena;
	
	@FindBy(id = "shoppingCartLink")
	protected WebElement btnCarrinho;
	
	protected void HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}
