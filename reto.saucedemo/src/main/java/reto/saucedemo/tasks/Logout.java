package reto.saucedemo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import reto.saucedemo.userinterface.itemsSwagPage;

public class Logout implements Task {


    public static Logout seleccionarLogout() {return Tasks.instrumented(Logout.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(itemsSwagPage.bottonLogout));
    }
}
