package com.br.keeggo.Code.CarrinhoPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarrinhoPageMap {

	private WebDriver driver;
	protected String emptyCart = "Your shopping cart is empty";
	
	
	@FindBy(xpath = "//*[@id=\"shoppingCart\"]/table/tbody/tr/td[2]/label")
	protected WebElement txtNomeProdCarrinho;
	
	@FindBy(xpath = "//*[@id=\"shoppingCart\"]/table/tbody/tr/td[6]/p")
	protected WebElement txtValorProdCarrinho;
	
	@FindBy(xpath = "//*[@id=\"shoppingCart\"]/table/tbody/tr/td[5]/label[2]")
	protected WebElement lblQuantProdCart;
	
	@FindBy(xpath = "//*[@id=\"shoppingCart\"]/table/tbody/tr/td[6]/span/a[3]")
	protected WebElement lnkRemoveItemCart;
	
	@FindBy(xpath = "//*[@id=\"shoppingCart\"]/table/tbody/tr/td[6]/span/a[1]")
	protected WebElement lnkEditProductCart;
	
	@FindBy(xpath = "//*[@id=\"shoppingCart\"]/div/label")
	protected WebElement txtCartMessage;

	protected void CategoriaProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
