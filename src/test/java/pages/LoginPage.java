package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebDriver;

@DefaultUrl("http://sahitest.com/demo/training/login.htm")
public class LoginPage extends PageObject {

    @FindBy(id = "irformularioinscripcion")
    WebElementFacade  BtnRegistrarse;

    @FindBy(id = "company")
    WebElementFacade TxtEmpresa;

    @FindBy(id = "asistente")
    WebElementFacade TxtNombresAsistente;

    @FindBy(id = "email")
    WebElementFacade TxtCorreo;

    @FindBy(id = "cellphone")
    WebElementFacade TxtCelular;

    @FindBy(id = "message")
    WebElementFacade TxtMensaje;

    @FindBy(id = "usuario")
    WebElementFacade TxtUsuario;

    @FindBy(id = "password")
    WebElementFacade TxtContrasena;

    @FindBy(id = "password2")
    WebElementFacade TxtConfirmarContrasena;

    @FindBy(id = "registrar")
    WebElementFacade BtnRegistrar;

    @FindBy(className = "ui-toast-detail")
    WebElementFacade mensajeToast;

    public WebDriver webDriver;

    public LoginPage(WebDriver webDriver){

    }

    public void ingresarEmpresa(String empresa){
        TxtEmpresa.type(empresa);
    }

    public void ingresarNombreAsistente(String nombreAsistente){
        TxtNombresAsistente.type(nombreAsistente);
    }

    public void abrirFormulario(){
           BtnRegistrarse.click();
    }

    public void enviarFormulario(){
        BtnRegistrar.click();
    }

    public void ingresarCorreoEloectronico(String correo){
        TxtCorreo.type(correo);
    }

    public void ingresarCelular(String celular){
        TxtCelular.type(celular);
    }

    public void ingresarMensaje(String mensaje){
        TxtMensaje.type(mensaje);
    }

    public void ingresarUsuario(String usuario){
        TxtUsuario.type(usuario);
    }

    public void ingresarContrasena(String contrasena){
        TxtContrasena.type(contrasena);
    }

    public void validarContrasena(String validarContrasena){
        TxtConfirmarContrasena.type(validarContrasena);
    }

    public  void verificarRegistro(){
        esperar(3);
        //MatcherAssert.assertThat("El registro ya existe","Transaccion Exitosa".equals(mensajeToast.getText()));
        MatcherAssert.assertThat("El usuario prueba8 ya existe", "El usuario prueba8 ya existe".contains(mensajeToast.getText()));
    }

    public void esperar(int timeInMilliseconds){
        try {
            Thread.sleep(timeInMilliseconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}