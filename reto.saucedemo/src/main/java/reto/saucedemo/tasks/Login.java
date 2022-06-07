package reto.saucedemo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import reto.saucedemo.userinterface.SwagLabsPage;

public class Login implements Task {
    private String user;
    private String password;

    public Login(String user, String password) {
        this.user = user;
        this.password = password;
    }


    public static Login OnThePage(String User, String password) {return Tasks.instrumented(Login.class, User, password);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(user).into(SwagLabsPage.INPUT_USER),
                Enter.theValue(password).into(SwagLabsPage.INPUT_PASSWORD),
                Click.on(SwagLabsPage.ENTER_BUTTON)
        );
    }
}
