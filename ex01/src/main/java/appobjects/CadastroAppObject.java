package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastroAppObject {

	private WebDriver driver;
	
	public CadastroAppObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getNomeCompleto() {
		return this.driver.findElement(By.id("nome"));	
	}
	
}
