@AdvantageShopping @Cadastro
Feature: Validar campos no cadastro de novo cliente
  Feature para validar campos no cadastro

  @Validar_Campos_Formulario_Novo_Cadastro
  Scenario Outline: Validar campos no formulario de CAdastro
    Given navego ate a pagina da advantage online shopping "Validar campos no formulario de CAdastro"
    And clico no icone do menu usuario
    And clico para criar novo usuario
    And informo o usuario para novo cadastro "<username15+>"
    And informo o email para novo cadastro "<email_nosimbols>"
    And informo a senha para novo cadastro "<password>"
    And confirmo a senha para novo cadastro "<diferentpassword>"
    And informo nome para novo cadastro "Jhon"
    Then valido mensagem informando campo usurio com mais de 15 caracteres
    Then valido mensagem informando email invalido
    Then valido mensagem informando senha invalida para cadastro
		Then valido mensagem informando diferenca entre as senhas
		
		Examples:
		| username15+             | email_nosimbols       | password12+              | diferentpassword |
		| testwith15lettersormore | anemailwithoutsimbols | passwithnocapitalletters | diferentpassword |