package pages;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
@DefaultUrl("http://sahitest.com/demo/training/login.htm")
public class LoginPageTest extends PageObject{
	@FindBy(name = "user")
    WebElementFacade TxtUsuario;
	@FindBy(name = "password")
    WebElementFacade TxtPassword;
	public WebDriver webDriver;
	@FindBy( xpath= "/html/body/center/div/form/table/tbody/tr[3]/td[2]/input")
	WebElementFacade BtnLogin;
	@FindBy( xpath= "//*[@id=\"available\"]/input[3]")
	WebElementFacade BtnSalir;
	public LoginPageTest(WebDriver driver) {
		super(driver);
	}

	public void ingresarUsuario(String usuario) {
		TxtUsuario.type(usuario);
		
	}

	public void ingresarPassword(String password) {
		TxtPassword.type(password);
		
	}

	public void clicInicioSesion() {
		BtnLogin.click();
		
	}

	public void salir() {
		esperar(6);
		BtnSalir.click();
		
	}
	 public void esperar(int timeInMilliseconds){
	        try {
	            Thread.sleep(timeInMilliseconds*1000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
}
