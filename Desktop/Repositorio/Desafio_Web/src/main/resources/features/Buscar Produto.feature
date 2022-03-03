@AdvantageShopping @Produtos
Feature: Consulta Produto
  Feature para consulta de produtos

  @Validar_Busca_Produtos
  Scenario Outline: Valdiar busca de produtos
    Given navego ate a pagina da advantage online shopping "Valdiar busca de produtos"
    And informo produto a ser procurado "<product>"
    Then valido se produtos exibidos contem o texto informado "<product>"
    And seleciono o primeiro produto
    Then valido o campo titulo
    Then valido o campo descricao do produto
    Then valido o campo preco
    
    Examples:
    | product |
    | LapTop  |
    