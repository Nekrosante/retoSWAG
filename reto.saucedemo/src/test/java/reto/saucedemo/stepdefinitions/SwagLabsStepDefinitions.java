package reto.saucedemo.stepdefinitions;


import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import reto.saucedemo.questions.ElementosRestantes;
import reto.saucedemo.questions.MensajeDeCompra;
import reto.saucedemo.questions.VerificarURL;
import reto.saucedemo.tasks.*;

public class SwagLabsStepDefinitions {

    @Before
    public void setStage() { OnStage.setTheStage(new OnlineCast());}

    @Given("^el acceso con credenciales validas (.*) y (.*)$")
    public void elAccesoConCredencialesValidas(String user, String password)  {
       OnStage.theActorCalled("UserStandar").wasAbleTo(OpenUp.thePage(), (Login.OnThePage(user, password)));
    }

    @When("^agregue al carrito de compras$")
    public void agregueAlCarritoDeCompras()  {
        OnStage.theActorInTheSpotlight().attemptsTo(Seleccionaar.productos());
    }
    @When("^ir al carrito de compras$")
    public void irAlCarritoDeCompras()  {
        OnStage.theActorInTheSpotlight().attemptsTo(carrito.shop());
    }
    @When("^finalizo la compra$")
    public void finalizoLaCompra() {
        OnStage.theActorInTheSpotlight().attemptsTo(Compra.checkout(), FinCompra.finalizar());}
    @Then("^el usuario espera el mensaje (.*)$")
    public void UsuarioEsperaElMensaje(String Mensaje)  {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(MensajeDeCompra.toThe(Mensaje)));
    }
    @When("^eliminar un elemento del carrito de compras$")
    public void eliminarUnElementoDelCarritoDeCompras()   {
        OnStage.theActorInTheSpotlight().attemptsTo(EliminarItem.Eliminar());
    }
    @Then("^Verifico los elementos del carrito (.*)$")
    public void Verificoloselementosdelcarrito(String texto){
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ElementosRestantes.toThe(texto)));
    }
    @When("^eliminar un elemento de la pagina principal$")
    public void eliminarunelementodelapaginaprincipal() {
        OnStage.theActorInTheSpotlight().attemptsTo(EliminarItemPaginaP.EliminarP());
    }
    @When("^Accedo al boton de menu$")
    public void AccedoAlBotonDeMenu() {
        OnStage.theActorInTheSpotlight().attemptsTo(BottonMenu.seleccionarmenu());
    }
    @When("^Accedo a opcion about$")
    public void AccedoOpcionabout() {
        OnStage.theActorInTheSpotlight().attemptsTo(BottonAbout.seleccionarAbout());
    }
    @Then("^el usuario puede ver a la pagina indicada (.*)$")
    public void UsuarioEsperaPaginaIndicada(String URL)  {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarURL.toThe(URL)));
    }
    @When("^Accedo a opcion logout$")
    public void AccedoOpcionLogout() {
        OnStage.theActorInTheSpotlight().attemptsTo(Logout.seleccionarLogout());}
    @When("^Accedes a opcion reset app state$")
    public void AccedesOpcionResetAppState() {
        OnStage.theActorInTheSpotlight().attemptsTo(ResetAppState.seleccionarResetAppState());}
}
