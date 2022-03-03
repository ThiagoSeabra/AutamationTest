@AdvantageShopping @Logout
Feature: Efetuar Log Out
  Nesse cenario sera realizado o login de conta ja cadastrada e logo apos o Logout da mesma

  @Realizar_LogOut
  Scenario Outline: Realizar Logout
    Given navego ate a pagina da advantage online shopping "Realizar Logout"
    And clico no icone do menu usuario
    And informo o nome de usuario na tela de login "<username>"
    And informo a senha do usuario na tela de login "<password>"
    And clico em Sign In na tela de login
    And valido usuario logado "<username>"
    And clico sobre a conta logada
    And clico em SignOut
    Then Valido se a conta foi deslogada

    Examples:
    | username  | password |
    | onlyTest2 | Senha123 |