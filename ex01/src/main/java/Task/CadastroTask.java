package Task;

import org.openqa.selenium.WebDriver;

import appobjects.CadastroAppObject;

public class CadastroTask {

	private CadastroAppObject cadastroAppObject;
	
	public CadastroTask(WebDriver driver) {
		this.cadastroAppObject = new CadastroAppObject(driver);		
	}
	
	public void PreencherCadastro(String nome, String email, String senha, String confirmaSenha, String telefone, String cidade) {
		cadastroAppObject.getNomeCompletoTextField().sendKeys(nome);
		cadastroAppObject.getEmailTextField().sendKeys(email);
		cadastroAppObject.getSenhaTextField().sendKeys(senha);
		cadastroAppObject.getConfirmaSenhaTextField().sendKeys(confirmaSenha);
		cadastroAppObject.getTelefoneTextField().sendKeys(telefone);	
	}
	
	public void EnviarFormulario() {
		this.cadastroAppObject.getCadastrarButton().submit();
		
	}
	
}
