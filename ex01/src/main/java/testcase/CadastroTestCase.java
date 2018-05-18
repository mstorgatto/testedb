package testcase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import Task.CadastroTask;

public class CadastroTestCase {

	private WebDriver driver;
	private CadastroTask cadastro;
	
	@Before
	public void setUp() {
		this.driver.get("http://www.xiru.rs/d/trocas/homolog/usuarios/cadastrar");
		this.driver.manage().window().maximize();
		this.cadastro = new CadastroTask(driver);
	}
	
	@Test
	public void testMain() {
		
		cadastro.PreencherCadastro("Maria", "teste@teste", "minhasenha", "minhasenha", "999999999", "Porto Alegre");
			
		
	}
		
	@After
	public void tearDown() {
		
	}
	
	
}
