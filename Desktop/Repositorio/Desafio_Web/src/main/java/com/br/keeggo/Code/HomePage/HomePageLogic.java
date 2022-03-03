package com.br.keeggo.Code.HomePage;

import org.junit.Assert;
import org.openqa.selenium.Keys;

import com.br.keeggo.Code.Chrome.ChromeLogic;
import io.cucumber.java.en.*;

public class HomePageLogic extends HomePageMap {
	
	@And("clico no icone do menu usuario")
	public void clicar_Menu_Usuario() {
		HomePage(ChromeLogic.navegador);
		btnMenuUsuario.click();
	}

	@And("clico sobre a conta logada")
	public void clico_Sobre_Usuario_Logado() {
		HomePage(ChromeLogic.navegador);
		lblUserLogado.click();
	}

	@And("clico em SignOut")
	public void clico_Para_Deslogar() {
		lnkSignOut.click();
	}

	@Then("Valido se a conta foi deslogada")
	public void valido_Nenhum_Usuario_Logado(){
		HomePage(ChromeLogic.navegador);
		Assert.assertEquals(lblUserLogado.isDisplayed() , false);
	}

	@Then("valido usuario logado {string}")
	public void valido_Usuario_Logado(String user)  {
		HomePage(ChromeLogic.navegador);
		Assert.assertEquals(lblUserLogado.getText(), user);
	}

	@And("clico no card de headPhones")
	public void clico_No_Card_Headphones(){
		HomePage(ChromeLogic.navegador);
		cardHeadPhones.click();
	}

	@And("informo produto a ser procurado {string}")
	public void informo_Produto_a_Ser_Procurado(String prod) {
		HomePage(ChromeLogic.navegador);
		if (iconBuscaProd.isDisplayed()) {
			iconBuscaProd.click();
			lblInformarProdutoTelaGrande.sendKeys(prod + Keys.ENTER);
		} else {
			lblInformarProdutoTelaPequena.sendKeys(prod + Keys.ENTER);
		}
	}

	@And("clico no icone do carrinho")
	public void Clico_no_Icone_do_Carrinho() {
		HomePage(ChromeLogic.navegador);
		btnCarrinho.click();
	}

}
