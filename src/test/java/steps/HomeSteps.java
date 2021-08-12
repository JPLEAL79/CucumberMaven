package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class HomeSteps extends BaseTests{

    String articulo = "muebles";

    @Given("^el usuario se encuentra en la página principal$")
    public void el_usuario_se_encuantra_en_la_página_principal() {
        Assert.assertTrue(homePage.homePageIsdisplayed());

    }

    @When("^ingresa un articulo en la caja de busquedad$")
    public void ingresa_un_articulo_en_la_caja_de_busquedad() {
        homePage.setSearchBox(articulo);

    }

    @And("^hace click sombre la lupa$")
    public void hace_click_sombre_la_lupa() {
        homePage.setClickButton();

    }

    @Then("^se despliega un formulario con las categorias y marcas$")
    public void se_despliega_un_formulario_con_las_categorias_y_marcas() {
         homePage.searchResults();
    }

}