@AdvantageShopping @Login 
Feature: Login
  Nesse cenario sera realizado o login de conta ja cadastrada

  @Realizar_Login
  Scenario Outline: Realizar login com Conta existente
    Given navego ate a pagina da advantage online shopping "Realizar login com Conta existente"
    And clico no icone do menu usuario
		And informo o nome de usuario na tela de login
		And informo a senha do usuario na tela de login
		And clico em Sign In na tela de login
		Then valido usuario logado "<username>"
		
		Examples:
		| username   | password |
		| onlyTest2  | Senha123 |