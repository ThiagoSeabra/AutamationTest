package com.br.keeggo.Code.CarrinhoPage;

import static org.testng.Assert.assertEquals;

import com.br.keeggo.Code.Chrome.ChromeLogic;
import com.br.keeggo.Code.ProductPage.ProdutoLogic;

import io.cucumber.java.en.*;

public class CarrinhoLogic extends CarrinhoPageMap {

	@Then("Valido se o produto esta no carrinho")
	public void validoItemCarrinho() {
		CategoriaProductPage(ChromeLogic.navegador);
		assertEquals(txtNomeProdCarrinho.getText() , ProdutoLogic.nameProd);
	}
	
	@Then("Valido se preco esta correto")
	public void validoValordoItemnoCarrinho() {
		assertEquals(txtValorProdCarrinho.getText() , ProdutoLogic.valorProd);
	}
	
	@And("clico para excluir o produto do carrinho")
	public void clicoParaExcluirProduto() {
		lnkRemoveItemCart.click();
	}
	
	@And("clico no botao para editar o produto")
	public void clicoParaEditarProduto() {
		lnkEditProductCart.click();
	}
	
	@Then("valido se alteracao foi efetuada")
	public void validoAlteracaonaQuantidadedoProduto() {
		assertEquals(lblQuantProdCart.getText(),"2");
		
	}
	
	@Then("valido se o produto foi excluido do carrinho")
	public void validoSeItemfoiExcluido() {
		assertEquals(txtCartMessage.getText(), emptyCart);		
	}
}
