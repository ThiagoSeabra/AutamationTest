@AdvantageShopping @Produtos @Carrinho @biulding
Feature: Editar Produto no carrinho
  Feature para edicao de Produtos adicionado ao carrinho

  @Editar_Produto_Carrinho
  Scenario Outline: Editar Produto no Carrinho
    Given navego ate a pagina da advantage online shopping "Editar Produto no Carrinho"
    And informo produto a ser procurado "<product>"
    And seleciono o primeiro produto
    And clico no botao para adiconar o item ao carrinho
		And clico no icone do carrinho
		And Valido se o produto esta no carrinho
		And clico no botao para editar o produto
		And clico para acrescentar uma unidade
		And clico no botao para adiconar o item ao carrinho
		And clico no icone do carrinho
		And Valido se o produto esta no carrinho
		Then valido se alteracao foi efetuada
		
		Examples:
		| product |
		| LapTop  |