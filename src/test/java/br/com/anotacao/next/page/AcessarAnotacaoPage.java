package br.com.anotacao.next.page;

import br.com.anotacao.next.core.BasePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import br.com.anotacao.next.core.BasePage;
import br.com.anotacao.next.core.Driver;

public class AcessarAnotacaoPage extends BasePage {

	@FindBy(id = "frame-notes")
	WebElement iframe;

	@FindBy(id = "func")
	WebElement caixaDeTextoFuncionalidade;

	@FindBy(id = "textAreaToken")
	WebElement caixaDeTextotoken;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement botaoRedirecionar;

	@FindBy(xpath = "//button[text()='adicionar nova']")
	WebElement botaoAdicionarAnotacao;

	@FindBy(id = "annotation")
	WebElement anIframe;

	@FindBy(id = "subject")
	WebElement escreverTitulo;

	@FindBy(id = "description")
	WebElement descreverAnotacao;

	@FindBy(xpath = "//mat-tab-body/div[1]/app-notes[1]/div[1]/div[1]/app-notes-form-register[1]/section[1]/form[1]/div[2]/checkbox[1]/mat-checkbox[1]/label[1]/div[1]")
	WebElement localizarCheckbox;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-frontoffice[1]/section[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/app-notes[1]/div[1]/div[1]/app-notes-form-register[1]/section[1]/form[1]/div[2]/checkbox[1]/mat-checkbox[1]/label[1]/div[1]")
	WebElement selectCheckBox;

	@FindBy(xpath = "//button[contains(text(),'Salvar')]")
	WebElement clicarSalvar;

	@FindBy(xpath = "//button[contains(text(),'Fechar')]")
	WebElement clicarFechar;

	// "//button[contains(text(),'Fechar')]")

	// input[@name="elementosForm:comidaFavorita"]
//	@FindBy(xpath = "//a[@class='button btn btn-default standard-checkout button-medium']")
//	WebElement botaoProceedFinal;

	public AcessarAnotacaoPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	public WebElement getSelectCheckBox() {
		return selectCheckBox;
	}

	public void setSelectCheckBox(WebElement selectCheckBox) {
		this.selectCheckBox = selectCheckBox;
	}

	public WebElement getClicarFechar() {
		return clicarFechar;
	}

	public void setClicarFechar(WebElement clicarFechar) {
		this.clicarFechar = clicarFechar;
	}

	public WebElement getAnIframe() {
		return anIframe;
	}

	public void setAnIframe(WebElement anIframe) {
		this.anIframe = anIframe;
	}

	public WebElement getCaixaDeTextoFuncionalidade() {
		return caixaDeTextoFuncionalidade;
	}

	public void setCaixaDeTextoFuncionalidade(WebElement caixaDeTextoFuncionalidade) {
		this.caixaDeTextoFuncionalidade = caixaDeTextoFuncionalidade;
	}

	public WebElement getCaixaDeTextotoken() {
		return caixaDeTextotoken;
	}

	public void setCaixaDeTextotoken(WebElement caixaDeTextotoken) {
		this.caixaDeTextotoken = caixaDeTextotoken;
	}

	public WebElement getBotaoRedirecionar() {
		return botaoRedirecionar;
	}

	public void setBotaoRedirecionar(WebElement botaoRedirecionar) {
		this.botaoRedirecionar = botaoRedirecionar;
	}

	public WebElement getBotaoAdicionarAnotacao() {
		return botaoAdicionarAnotacao;
	}

	public void setBotaoAdicionarAnotacao(WebElement botaoAdicionarAnotacao) {
		this.botaoAdicionarAnotacao = botaoAdicionarAnotacao;
	}

	public WebElement getIframe() {
		return iframe;
	}

	public void setIframe(WebElement iframe) {
		this.iframe = iframe;
	}

	public WebElement getAnnotationIframe() {
		return anIframe;
	}

	public void setAnnotationIframe(WebElement annotationIframe) {
		this.anIframe = annotationIframe;
	}

	public WebElement getClicarSalvar() {
		return clicarSalvar;
	}

	public void setClicarSalvar(WebElement clicarSalvar) {
		this.clicarSalvar = clicarSalvar;
	}

	public WebElement getDescreverAnotacao() {
		return descreverAnotacao;
	}

	public void setDescreverAnotacao(WebElement descreverAnotacao) {
		this.descreverAnotacao = descreverAnotacao;
	}

	public WebElement getEscreverTitulo() {
		return escreverTitulo;
	}

	public void setEscreverTitulo(WebElement escreverTitulo) {
		this.escreverTitulo = escreverTitulo;
	}

	public WebElement getLocalizarCheckbox() {
		return localizarCheckbox;
	}

	public void setLocalizarCheckbox(WebElement localizarCheckbox) {
		this.localizarCheckbox = localizarCheckbox;
	}

}
