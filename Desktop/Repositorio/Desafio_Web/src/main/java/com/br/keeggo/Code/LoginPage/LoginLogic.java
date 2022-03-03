package com.br.keeggo.Code.LoginPage;

import static org.testng.Assert.assertEquals;

import com.br.keeggo.Code.Chrome.ChromeLogic;
import com.br.keeggo.Code.Utils.Utils;

import io.cucumber.java.en.*;

public class LoginLogic extends LoginPageMap {

	@And("clico para criar novo usuario")
	public void clicarParaCadastrarNovoUsuario() throws Exception {
		Thread.sleep(2000);
		LoginPage(ChromeLogic.navegador);
		lnkNewAccount.click();
	}

	@And("informo o nome de usuario na tela de login {string}")
	public void informoUsuarionaTeladeLogin(String username) {
		LoginPage(ChromeLogic.navegador);
		lblUsername.sendKeys(username);
	}

	@And("informo a senha do usuario na tela de login {string}")
	public void informo_Senha_Usuario_Tela_de_Login(String password) {
		lblPassword.sendKeys(password);
	}
	
	@And("informo o nome de usuario na tela de login")
	public void informoUsuarionaTeladeLogin() {
		LoginPage(ChromeLogic.navegador);
		lblUsername.sendKeys(Utils.userName);
	}

	@And("informo a senha do usuario na tela de login")
	public void informo_Senha_Usuario_Tela_de_Login() {
		lblPassword.sendKeys(Utils.password);
	}

	@And("clico em Sign In na tela de login")
	public void clicoemSignIn() {
		btnSignIn.click();
	}

	@And("clico no botao para logar usando o facebook")
	public void realizarLoginWithFacebook() {

	}

	@Then("valido mensagem de Dados Invalidos")
	public void validarMensagemDadosInvalidos() {
		assertEquals(txtInvalidUserorPassword.getText() , messageInvalidUser);
	}

	@Then("valido mensagem de usuario bloqueado")
	public void validarMensagemUsuarioBloqueado() {
		assertEquals(txtInvalidUserorPassword.getText() , messageBlockedUser);
	}
	
}
