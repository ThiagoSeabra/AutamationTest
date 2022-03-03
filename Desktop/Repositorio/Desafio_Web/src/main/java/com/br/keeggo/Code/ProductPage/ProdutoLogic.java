package com.br.keeggo.Code.ProductPage;

import static org.testng.Assert.assertEquals;

import com.br.keeggo.Code.CategoriaProdutosPage.CategoriaProdutosLogic;
import com.br.keeggo.Code.Chrome.ChromeLogic;
import com.br.keeggo.Code.Utils.Utils;
import org.testng.annotations.Test;

import io.cucumber.java.en.*;

public class ProdutoLogic extends ProdutoPageMap {

	public static String nameProd;
	public static String valorProd;
	public static String quantProd;

	@Then("valido o campo titulo")
	public void verifico_Se_o_Titulo_e_igual_ao_Produto_Selecionado() {

		productPage(ChromeLogic.navegador);
		Utils.scrollToElement(btnAdicionaraoCarrinho);
		assertEquals(lblNomeProduto.getText().toLowerCase(), CategoriaProdutosLogic.nameProdCard.toLowerCase());
	}

	@Then("valido o campo preco")
	public void verifico_Se_o_Valor_e_igual_ao_Produto_Selecionado() {
		assertEquals(lblValorProduto.getText(), CategoriaProdutosLogic.valueProdCard);
	}

	@Then("valido o campo descricao do produto")
	public void verifico_Se_a_Descricao_Esta_Sendo_Exibida() {
		assertEquals(lblDescicaoProduto.isDisplayed(), true);
	}

	@And("clico para acrescentar uma unidade")
	public void clicar_em_Incrementar_Quantidade() {
		btnIncrementQuant.click();
	}

	@And("clico no botao para adiconar o item ao carrinho")
	public void clico_Botao_Adicionar_ao_Carrinho() {
		productPage(ChromeLogic.navegador);
		this.nameProd = lblNomeProduto.getText();
		this.valorProd = lblValorProduto.getText();
		btnAdicionaraoCarrinho.click();
	}

}
