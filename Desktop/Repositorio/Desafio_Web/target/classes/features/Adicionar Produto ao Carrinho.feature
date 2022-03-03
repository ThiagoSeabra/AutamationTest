@AdvantageShopping @Produtos @Carrinho
Feature: Adicionar Item ao Carrinho
  Feature para adicionar produtos ao carrinho

  @AdicionarProdutoaoCarrinho
  Scenario: Adiconar item ao Carrinho
    Given navego ate a pagina da advantage online shopping "Adiconar item ao Carrinho"
    And clico no card de headPhones
    And seleciono o primeiro produto
		And clico no botao para adiconar o item ao carrinho
		And clico no icone do carrinho
		Then Valido se o produto esta no carrinho
		Then Valido se preco esta correto