package reto.saucedemo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import reto.saucedemo.userinterface.itemsSwagPage;

public class BottonMenu implements Task {
    public static BottonMenu seleccionarmenu() {return Tasks.instrumented(BottonMenu.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(itemsSwagPage.bottonMenu));
    }
}
