package com.br.keeggo.Code.ProductPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProdutoPageMap {
	
	private WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"Description\"]/h1")
	protected WebElement lblNomeProduto;
	
	@FindBy(xpath = "//*[@id=\"Description\"]/h2")
	protected WebElement lblValorProduto;
	
	@FindBy(xpath = "//*[@id=\"Description\"]/p")
	protected WebElement lblDescicaoProduto;
	
	@FindBy(name = "save_to_cart")
	protected WebElement btnAdicionaraoCarrinho;
	
	@FindBy(xpath = "//*[@id=\"productProperties\"]/div[2]/e-sec-plus-minus/div/div[3]")
	protected WebElement btnIncrementQuant;
	
	@FindBy(xpath = "//*[@id=\"productProperties\"]/div[2]/e-sec-plus-minus/div/div[2]")
	protected WebElement lblQuantProduct;
	
	@FindBy(xpath = "//*[@id=\"productProperties\"]/div[2]/e-sec-plus-minus/div/div[1]")
	protected WebElement btnDecrementQuant;

	protected void productPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
