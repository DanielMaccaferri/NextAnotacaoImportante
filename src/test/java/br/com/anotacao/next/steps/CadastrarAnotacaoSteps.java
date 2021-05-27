package br.com.anotacao.next.steps;
import static br.com.anotacao.next.core.Driver.getDriver;
import br.com.anotacao.next.funcionalidade.AcessarAnotacaoFuncionalidade;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CadastrarAnotacaoSteps {
	
	AcessarAnotacaoFuncionalidade emulador = new AcessarAnotacaoFuncionalidade();
	String url = "https://telasnegocio.stf.tu.aznxt.local/telasdenegocio/moldura.html";

	@Dado("^que eu acesse Telas$")
	public void que_eu_acesse_Telas() throws Throwable {
		getDriver().get(url);
		emulador.escreverFuncionalidade();
		emulador.escreverToken();
		emulador.clicarRedirecionar();
	}

	@Dado("^eu clicar no icone do Adicionar Nova Anotacao$")
	public void eu_clicar_no_icone_do_Adicionar_Nova_Anotacao() throws Throwable {
		emulador.clicarBotaoAdicionarAnotacao();
	}

	@Dado("^a pagina anotacoes deve aparecer$")
	public void a_pagina_anotacoes_deve_aparecer() throws Throwable {
		
	}

	@Quando("^quando eu inserir os dados da anotacao$")
	public void quando_eu_inserir_os_dados_da_anotacao() throws Throwable {
		emulador.cadastrarAnotacao();
		
	}

	@Quando("^eu clicar em salvar$")
	public void eu_clicar_em_salvar() throws Throwable {
		emulador.getClicarFechar();
	}

	@Entao("^a anotacao dever ser salva com sucesso\\.$")
	public void a_anotacao_dever_ser_salva_com_sucesso() throws Throwable {
		
	}

}
