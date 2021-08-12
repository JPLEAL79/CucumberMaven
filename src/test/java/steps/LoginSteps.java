package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class LoginSteps extends BaseTests {



    @Given("^que navego a la página de Easy$")
    public void que_navego_a_la_página_de_Easy() throws Throwable {

    }

    @When("^doy click en icono de inicio sesión$")
    public void doy_click_en_icono_de_inicio_sesión() throws Throwable {
        loginPage.clickIconoIniciarSesión();

    }

    @Then("^se despliega el formulario de login$")
    public void se_despliega_el_formulario_de_login() throws Throwable {
        Assert.assertTrue(loginPage.isdisplayedForm());

    }

    @Then("^ingreso el (.*) y (.*)$")
    public void ingreso_el_rut_y_la_contraseña(String rut, String contraseña)  {
      loginPage.setCampoRut(rut);
      loginPage.setCampoContraseña(contraseña);

    }

    @When("^doy click en el botón iniciar sesión$")
    public void doy_click_en_el_botón_iniciar_sesión() throws Throwable {
        loginPage.setButtonEntrar();

    }

    @Then("^me redirige al sitio privado$")
    public void me_redirige_al_sitio_privado() throws Throwable {
        Assert.assertTrue(loginPage.isdisplayedForm());

    }

}
