package reto.saucedemo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import reto.saucedemo.userinterface.CarritoPage;
import reto.saucedemo.userinterface.InformacionPage;

public class Compra implements Task {

    public static Compra checkout() {
        return Tasks.instrumented(Compra.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CarritoPage.CHECKOUT),
                Enter.theValue("Luis").into(InformacionPage.INPUT_FNAME),
                Enter.theValue("Arcia").into(InformacionPage.INPUT_LNAME),
                Enter.theValue("125298").into(InformacionPage.INPUT_POSTAL),
                Click.on(InformacionPage.CONTINUE)
        );

    }
}
