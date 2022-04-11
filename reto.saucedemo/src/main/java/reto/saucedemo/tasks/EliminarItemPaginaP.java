package reto.saucedemo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import reto.saucedemo.userinterface.CarritoPage;

public class EliminarItemPaginaP implements Task {
    public static EliminarItemPaginaP EliminarP() {
        return Tasks.instrumented(EliminarItemPaginaP.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CarritoPage.REMOVE)
        );
    }
}
