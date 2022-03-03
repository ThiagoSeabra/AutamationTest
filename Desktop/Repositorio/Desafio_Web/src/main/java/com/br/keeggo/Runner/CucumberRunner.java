package com.br.keeggo.Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		glue = "com.br.keeggo.Code",
		features = {"src/main/resources/features/"},
		monochrome = true,
		tags = "@Validar_Busca_Produtos"
		)

public class CucumberRunner {

	
}
