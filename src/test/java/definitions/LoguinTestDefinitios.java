package definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import steps.LoginTestSteps;

public class LoguinTestDefinitios  {

	@Steps
	LoginTestSteps loginTestStep;
	@Given("^como usuario ingreso al sitio$")
	public void como_usuario_ingreso_al_sitio() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    loginTestStep.ingresarSitio();
	}

	@When("^ingreso \"([^\"]*)\" y \"([^\"]*)\"$")
	public void ingreso_y(String usuario, String password) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    loginTestStep.ingresarusuariopassword(usuario, password);
	    loginTestStep.ingresar();
	    
	}
	@When("^interactuo en el portal$")
	public void interactuo_en_el_portal() throws Exception {
	   
	}

	@Then("^salgo del portal$")
	public void salgo_del_portal() throws Exception {
		loginTestStep.salir();
	}
}
