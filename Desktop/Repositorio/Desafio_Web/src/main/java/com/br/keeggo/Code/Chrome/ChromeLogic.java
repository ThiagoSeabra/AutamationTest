package com.br.keeggo.Code.Chrome;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

import com.br.keeggo.Code.HomePage.HomePageMap;
import com.br.keeggo.Code.Utils.PDFCreator;
import com.br.keeggo.Code.Utils.Utils;
import com.lowagie.text.DocumentException;

import io.cucumber.core.options.CucumberPropertiesProvider;
import io.cucumber.java.*;
import io.cucumber.java.en.*;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

public class ChromeLogic {

	public static String basePage = "http://advantageonlineshopping.com/#/";
	public static WebDriver navegador;
	static HomePageMap homePage;

	@Before
	public static void inicializaChromeDriver() throws DocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/chromedriver.exe");
		navegador = new ChromeDriver();
		Utils.lerArquivoXlsx();
	}

	@Given("navego ate a pagina da advantage online shopping {string}")
	public void navegarAtePagina(String cenario) throws IOException {
		PDFCreator.GeradorPDF(cenario+".pdf");
		navegador.navigate().to(ChromeLogic.basePage);
	}

	@After
	public void fecharNavegador() {

		PDFCreator.closeDocument();
		navegador.close();
	}
}