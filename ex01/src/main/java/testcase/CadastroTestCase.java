package testcase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Task.CadastroTask;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CadastroTestCase {

	private WebDriver driver;
	private CadastroTask cadastro;
	
	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
		this.driver.get("http://www.xiru.rs/d/trocas/homolog/usuarios/cadastrar");
		this.driver.manage().window().maximize();
		this.cadastro = new CadastroTask(driver);
	}
	
	@Test
	public void testMain() {
		
		this.cadastro.PreencherCadastro("Maria", "teste@teste", "minhasenha", "minhasenha", "999999999", "Porto Alegre");
		this.cadastro.EnviarFormulario();	
		
	}
		
	//@After
	//public void tearDown() {
	//}
	
	
}
