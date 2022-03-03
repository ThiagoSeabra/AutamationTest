package com.br.keeggo.Code.CadastroClientePage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.ui.Select;
import com.br.keeggo.Code.Chrome.ChromeLogic;
import io.cucumber.java.en.*;

public class CadastroClienteLogic extends CadastroClientePageMap {
	
	private String invalidUserNameMessage = "Use maximum 15 character";
	private String invalidEmailMessage = "Your email address isn't formatted correctly";
	private String diferentPasswordMessage = "Passwords do not match";

	@And("informo o usuario para novo cadastro {string}")
	public void informoUsuarioNovoCadastro(String username) {
		CadastroClientePage(ChromeLogic.navegador);
		lblUserName.sendKeys(username);
	}

	@And("informo o email para novo cadastro {string}")
	public void informoEmailNovoCadastro(String email) {
		lblEmail.sendKeys(email);
	}

	@And("informo a senha para novo cadastro {string}")
	public void informoSenhaNovoCadastro(String senha) {
		lblPassword.sendKeys(senha);
	}

	@And("confirmo a senha para novo cadastro {string}")
	public void confirmoSenhaNovoCadastro(String senha) {
		lblConfirmPassword.sendKeys(senha);
	}

	@And("informo nome para novo cadastro {string}")
	public void informoNomeNovoCadastro(String nome) {
		lblFirstName.sendKeys(nome);
	}

	@And("informo sobrenome para novo cadastro {string}")
	public void informoSobrenomeNovoCadastro(String sobrenome) {
		lblLastName.sendKeys(sobrenome);
	}

	@And("informo telefone para novo cadastro {string}")
	public void informoTelefoneNovoCadastro(String telefone) {
		lblPhoneNumber.sendKeys(telefone);
	}

	@And("clico para selecionar o pais para novo cadastro")
	public void clicarParaSelecionarPaisNovoCadastro() {
		lstContry.click();
	}

	@And("seleciono pais para novo cadastro {string}")
	public void selecionoPaisNovoCadastro(String pais) {
		new Select(lstContry).selectByVisibleText(pais);
	}

	@And("informo cidade para novo cadastro {string}")
	public void informoCidadeNovoCadastro(String cidade) {
		lblCity.sendKeys(cidade);
	}

	@And("informo endereco para novo cadastro {string}")
	public void informoEnderecoNovoCadastro(String rua) {
		lblAdress.sendKeys(rua);
	}

	@And("informo estado par novo cadastro {string}")
	public void informoEstadoNovoCadastro(String estado) {
		lblState.sendKeys(estado);
	}

	@And("informo CEP para novo cadastro {string}")
	public void informoCepNovoCadastro(String cep) {
		lblPostalCode.sendKeys(cep);
	}

	@And("seleciono o check de condicoes em novo cadatro")
	public void selecionoCheckCondicoesNovoCadastro() {
		chkAgreeConditions.click();
	}

	@And("clico no botao para realizar o registro de novo cadastro")
	public void clicoemRegistroNovoCadastro() {
		btnRegister.click();
	}
	
	@Then("valido mensagem informando campo usurio com mais de 15 caracteres")
	public void validoMensagemdeErroNoUsuario() {
		CadastroClientePage(ChromeLogic.navegador);
		assertEquals(txtUserNameErrorMessage.getText(), invalidUserNameMessage);
	}
	
	@Then("valido mensagem informando email invalido")
	public void validoMensagemdeErroNoEmail() {
		CadastroClientePage(ChromeLogic.navegador);
		assertEquals(txtEmailErrorMessage.getText(), invalidEmailMessage);
	}
	
	@Then("valido mensagem informando senha invalida para cadastro")
	public void validoMensagemdeErroNaSenha() {
		CadastroClientePage(ChromeLogic.navegador);
		txtPasswordErrorMessage.isDisplayed();
	}
	
	@Then("valido mensagem informando diferenca entre as senhas")
	public void validoMensagemdeErroNaConfirmacaodeSenha() {
		CadastroClientePage(ChromeLogic.navegador);
		assertEquals(txtConfirmPasswordErrorMessage.getText(), diferentPasswordMessage);
	}

}
