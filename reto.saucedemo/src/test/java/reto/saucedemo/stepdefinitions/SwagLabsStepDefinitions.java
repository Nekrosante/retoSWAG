package reto.saucedemo.stepdefinitions;


import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import reto.saucedemo.questions.MensajeDeCompra;
import reto.saucedemo.tasks.*;

public class SwagLabsStepDefinitions {

    @Before
    public void setStage() { OnStage.setTheStage(new OnlineCast());}

    @Given("^el acceso con credenciales validas (.*) y (.*)$")
    public void elAccesoConCredencialesValidas(String user, String password)  {
       OnStage.theActorCalled("UserStandar").wasAbleTo(
               OpenUp.thePage(),
               (Login.OnThePage(user, password)));
    }
    @When("^agregue al carrito de compras$")
    public void agregueAlCarritoDeCompras()  {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Seleccionaar.productos());
    }
    @When("^ir al carrito de compras$")
    public void irAlCarritoDeCompras()  {
        OnStage.theActorInTheSpotlight().attemptsTo(
                carrito.shop());
    }
    @When("^finalizo la compra$")
    public void finalizoLaCompra() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Compra.checkout(),
                FinCompra.finalizar());}
    @Then("^el usuario espera el mensaje (.*)$")
    public void UsuarioEsperaElMensaje(String Mensaje)  {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                MensajeDeCompra.toThe(Mensaje)));
    }
}
