@AdvantageShopping @Produtos @Carrinho
Feature: Ecluir Produto do Carrinho
 	Feature para exclusao de Produtos adicionado ao carrinho

  @Excluir_Produto_Carrinho
  Scenario Outline: Excluir produto Carrinho
    Given navego ate a pagina da advantage online shopping "Excluir produto Carrinho"
    And informo produto a ser procurado "<product>"
    And seleciono o primeiro produto
    And clico no botao para adiconar o item ao carrinho
		And clico no icone do carrinho
		And Valido se o produto esta no carrinho
		And clico para excluir o produto do carrinho
		Then valido se o produto foi excluido do carrinho

		Examples:
		| product |
		| LapTop  |