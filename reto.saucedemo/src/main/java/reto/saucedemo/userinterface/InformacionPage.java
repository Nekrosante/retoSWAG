package reto.saucedemo.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InformacionPage extends PageObject {
    public static final Target INPUT_FNAME = Target.the("Cuadro de texto para escribir el primer nombre")
            .located(By.id("first-name"));
    public static final Target INPUT_LNAME = Target.the("Cuadro de texto para escribir el segundo nombre")
            .located(By.id("last-name"));
    public static final Target INPUT_POSTAL = Target.the("Cuadro de texto para escribir el codigo postal")
            .located(By.id("postal-code"));
    public static final Target CONTINUE = Target.the("botton para proseguir con la compra")
            .located(By.id("continue"));
}
