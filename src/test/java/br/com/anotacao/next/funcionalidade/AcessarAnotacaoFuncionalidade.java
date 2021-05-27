package br.com.anotacao.next.funcionalidade;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import br.com.anotacao.next.core.Driver;
import br.com.anotacao.next.page.AcessarAnotacaoPage;

public class AcessarAnotacaoFuncionalidade extends AcessarAnotacaoPage{

	private AcessarAnotacaoPage emulador;
	private WebElement iframe;

	public AcessarAnotacaoFuncionalidade() {
		emulador = new AcessarAnotacaoPage();
	}
	
	public void inicializarDriver() {
		Driver.getDriver();
		emulador.sairFrame();

	}	
	
	public void adicionarAnotacao() {
		emulador.acessarFrame(iframe);
	}


		
		// emulador.aguardarElementoClicavelAparecer(btnCliqueAqui, 10);
//		emulador.clicarBtn(btnCliqueAqui);

	
//	public void acessarAnotacoes() {
//		page.acessarFrame(iframe);
//		page.aguardarElementoClicavelAparecer(btnCliqueAqui, 10);
//		page.clicarBtn(btnCliqueAqui);
//		
//	}

	public void escreverFuncionalidade() {
		emulador.getCaixaDeTextoFuncionalidade().sendKeys("2");

	}

	public void escreverToken() {
		emulador.getCaixaDeTextotoken().sendKeys(
				"eyAgICJhbGciOiAiSFMyNTYiIH0.ew0KICAic3ViIjoiOTAwMDg2NDQwMjAiLA0KICAidXNlckRhdGEiOnsiaG9zdE5hbWUiOiJENDI1M0U3ODk1IiwiYWdlbnRJZCI6Ikk5MzE2NTAiLCJ0aWNrZXQiOiIyMEM0RkYwNEZFQjFGODBBIiwiY2xhaW1zIjp7ImNzciI6dHJ1ZSwiY3VzdG9tZXIiOnRydWV9LCJhY2NvdW50cyI6W3siY3JlYXRlVXNlcklkIjo0MDUyNSwidXBkYXRlRnVuY3Rpb25OYW1lIjoiQ3VzdG9tZXJCYW5rQWNjb3VudERhb0ltcGwiLCJ1cGRhdGVVc2VySWQiOjQwNTI1LCJjdXN0b21lcklkIjo0MDUyNSwiYWNjb3VudE51bWJlciI6MTUzMzYsImNyZWF0ZUZ1bmN0aW9uTmFtZSI6IkN1c3RvbWVyQmFua0FjY291bnREYW9JbXBsIiwiYnJhbmNoIjozOTI5LCJ1cGRhdGVUaW1lc3RhbXAiOiIyMDIwLTA3LTMxVDEyOjM2OjMxWiIsInVuaXF1ZUlEIjoxNTQ1NSwiY3JlYXRlVGltZXN0YW1wIjoiMjAyMC0wNy0zMVQxMjozNjozMVoifV0sInNlc3Npb25JZCI6IjAwMUQ2MzVFOUQxRUZDMFgwMkVFRUZFNTI2MzAzRkM5IiwiZGV2aWNlSWQiOiJPcHRpb25hbC5lbXB0eSIsImN1c3RvbWVyIjp7ImdlbmRlckNvZGUiOiJNIiwibWFyaXRhbFN0YXR1c0lkIjoiU0lOR0xFIiwibW9udGhseUluY29tZUFtb3VudCI6IjUwMDAuMCIsImNwZiI6IjkwMDA4NjQ0MDIwIiwiYmlydGhEYXRlIjoiMTk4OC0xMS0xMiIsInVuaXF1ZUlEIjo0MDUyNX19DQp9.gaZ3DMCI02AQfnQSWSkMX5qSmgb6YnkliDryD8vr-sw");

	}

	public void clicarRedirecionar() {
		emulador.getBotaoRedirecionar().click();
	}
	

	public void clicarBotaoAdicionarAnotacao() {
		emulador.acessarFrame(getIframe());
		emulador.getBotaoAdicionarAnotacao().click();
		emulador.sairFrame();
	}
	
	public void cadastrarAnotacao() {
			for(int i = 0; i <= 50; i++){
			emulador.acessarFrame(getAnnotationIframe());
			emulador.aguardarElementoAparecer(getEscreverTitulo(),15);
			emulador.getEscreverTitulo().sendKeys("Teste de inclusão");
			emulador.aguardarElementoAparecer(getDescreverAnotacao(), 55);
			emulador.getDescreverAnotacao().sendKeys("Teste de descrição.");
			emulador.aguardarElementoAparecer(getLocalizarCheckbox(), 35);
			emulador.getLocalizarCheckbox().isSelected();
			emulador.aguardarElementoClicavelAparecer(getSelectCheckBox(), 20);
			emulador.getSelectCheckBox().click();		
			emulador.aguardarElementoClicavelAparecer(getClicarSalvar(), 20);
			emulador.getClicarSalvar().click();
			emulador.aguardarElementoClicavelAparecer(getClicarFechar(), 50);
			emulador.getClicarFechar().sendKeys(Keys.ENTER);	
			emulador.sairFrame();
			
			
			}
				

	}
	
}
