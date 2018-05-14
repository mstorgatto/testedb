package verificationpoints;

import org.openqa.selenium.WebDriver;

public class LoginVerificationPoint {
	private WebDriver driver;
	
	 public LoginVerificationPoint (WebDriver driver) {
	 this.driver = driver;
	 }
	 
	 public void checkHelloMessage() {
		 final String expectedMessage = "Hi demo";
		 
		 if(this.driver.getPageSource().contains(expectedMessage)) {
			 
			 System.out.println("Entrou");
		 }
		 
	 }
	 
	
	
}

//https://github.com/thvieira/treinamento-selenium