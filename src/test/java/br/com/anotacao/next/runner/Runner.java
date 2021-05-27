package br.com.anotacao.next.runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/acessarAnotacao/feature/cadastrarAnotacao.feature",
		glue = { "br.com.anotacao.next.steps",  "br.com.anotacao.next.core"},
		tags = { "@geral" },
		monochrome = true,
		dryRun = false,
		strict= true)

public class Runner {

}


