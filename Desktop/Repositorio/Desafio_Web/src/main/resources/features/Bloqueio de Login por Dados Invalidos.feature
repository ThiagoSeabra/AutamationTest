@AdvantageShopping @Login @Bloqueio
Feature: Bloqueio Login
  Nesse cenario sera realizado o login de conta via Facebook

  @Realizar_Login_Dados_Invalidos
  Scenario Outline: Bloqueio de Login
    Given navego ate a pagina da advantage online shopping "Bloqueio de Login"
    And clico no icone do menu usuario
		And informo o nome de usuario na tela de login "<username>"
		And informo a senha do usuario na tela de login "00000000"
		And clico em Sign In na tela de login
		And valido mensagem de Dados Invalidos
		And clico em Sign In na tela de login
		And valido mensagem de Dados Invalidos
		And clico em Sign In na tela de login
		And valido mensagem de Dados Invalidos
		And clico em Sign In na tela de login
		Then valido mensagem de usuario bloqueado
		
		Examples:
		| username | password |
		| onlyTest | Senha123 |
		
				