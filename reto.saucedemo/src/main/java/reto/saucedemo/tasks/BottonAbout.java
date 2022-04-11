package reto.saucedemo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import reto.saucedemo.userinterface.itemsSwagPage;

public class BottonAbout implements Task {
    public static BottonAbout seleccionarAbout() {return Tasks.instrumented(BottonAbout.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(itemsSwagPage.bottonAbout));
    }
}
