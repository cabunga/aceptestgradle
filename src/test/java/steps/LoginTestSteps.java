package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import pages.LoginPageTest;

public class LoginTestSteps extends ScenarioSteps {
	LoginPageTest loginPageTest = new LoginPageTest(getDriver());

	public LoginTestSteps(Pages page) {
		super(page);
	}
	@Step
	public void ingresarSitio() {
		loginPageTest.open();
	}
	@Step
	public void ingresarusuariopassword(String usuario,String password) {
		loginPageTest.ingresarUsuario(usuario);
		loginPageTest.ingresarPassword(password);
	}
	@Step
	public void ingresar() {
		loginPageTest.clicInicioSesion();
	}
	@Step
	public void salir() {
		loginPageTest.salir();
		
	}
}
