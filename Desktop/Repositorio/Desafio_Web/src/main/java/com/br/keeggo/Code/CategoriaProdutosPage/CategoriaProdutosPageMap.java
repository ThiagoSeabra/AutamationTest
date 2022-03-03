package com.br.keeggo.Code.CategoriaProdutosPage;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.br.keeggo.Code.Chrome.ChromeLogic;

public class CategoriaProdutosPageMap {
	
	private WebDriver driver;
	
	@FindBy(xpath = "/html/body/div[3]/section/article/div[3]/div/div/div[2]/ul/li[1]")
	protected WebElement lstfirstProduct;
	
	@FindBy(xpath = "//*[@id=\"searchPage\"]/div[3]/div/div/div[2]/ul/li[1]")
	protected WebElement lslFirstProdSearch;
	
	@FindBy(xpath = "/html/body/div[3]/section/article/div[3]/div/div/div[2]/ul/li[1]/p[1]/a")
	protected WebElement txtFirstProdName;
	
	@FindBy(xpath = "/html/body/div[3]/section/article/div[3]/div/div/div[2]/ul/li[1]/p[2]/a")
	protected WebElement txtFirstProdValue;
	
	
	
	public void validarProdutosListados(String search) {
		boolean continuar = true;
		int possition = 1;

		while (continuar) {

			try {
				String element = ChromeLogic.navegador
						.findElement(By
								.xpath("//*[@id=\"searchPage\"]/div[3]/div/div/div[2]/ul/li[" + possition + "]/p[1]/a"))
						.getText();
				if (!element.toLowerCase().contains(search.toLowerCase())) {
					
					continuar = false;
					fail("Produto: "+element+" nao contem valor da busca: "+ search);
				}
			} catch (NoSuchElementException e) {
				continuar = false;
			}
			possition++;
		}
	}
	
	protected void CategoriaProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}
