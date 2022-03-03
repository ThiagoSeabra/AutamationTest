package com.br.keeggo.Code.CategoriaProdutosPage;

import com.br.keeggo.Code.Chrome.ChromeLogic;
import io.cucumber.java.en.*;

public class CategoriaProdutosLogic extends CategoriaProdutosPageMap {

	public static String nameProdCard;
	public static String valueProdCard;
	
	
	@And("seleciono o primeiro produto")
	public void seleciono_Primeiro_Produto_da_Lista() {
		CategoriaProductPage(ChromeLogic.navegador);
		this.nameProdCard = txtFirstProdName.getText();
		this.valueProdCard = txtFirstProdValue.getText();
		lstfirstProduct.click();
	}

	@Then("valido se produtos exibidos contem o texto informado {string}")
	public void valido_Produtos_Exibidos_Contem_Texto_da_Busca(String prod) {
		CategoriaProductPage(ChromeLogic.navegador);
		validarProdutosListados(prod);
	}

}
