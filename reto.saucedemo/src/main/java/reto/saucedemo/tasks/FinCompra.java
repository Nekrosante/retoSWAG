package reto.saucedemo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import reto.saucedemo.userinterface.ResumenPage;

public class FinCompra implements Task {
    public static FinCompra finalizar() {
        return Tasks.instrumented(FinCompra.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ResumenPage.FINALIZAR)
        );


    }
}
